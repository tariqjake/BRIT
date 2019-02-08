package utilities;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public  class TestBase {
    protected WebDriver driver;
    protected Pages pages;

    protected static ExtentReports report;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;


    @BeforeMethod
    public  void setupMethod(){
        driver = Driver.getDriver();
        pages = new Pages();
        //we can write method here
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) throws IOException {
        //if any test fails it can detect it, take a screen shot  at the point and attach it to report
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotLocation = BrowserUtilities.getScreenshot(result.getName());
            extentLogger.fail(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshotLocation);
            extentLogger.fail(result.getThrowable());

        } else if (result.getStatus() == ITestResult.SKIP) {
            extentLogger.skip("Test Case Skipped: " + result.getName());
        }
        //Driver.closeDriver();
    }

    @BeforeTest
    public void setUpTest() {
        report = new ExtentReports();

        String filePath = System.getProperty("user.dir") + "/test-output/report.html";

        //for windows user use this one
        //String filePath = System.getProperty("user.dir") + "\test-output\report.html";

        htmlReporter = new ExtentHtmlReporter(filePath);

        report.attachReporter(htmlReporter);

        report.setSystemInfo("Tysons_03", "Staging");
        report.setSystemInfo("Browser", ConfigurationReader.getProperty("browser"));
        htmlReporter.config().setDocumentTitle("Brite ERP Inventory");
        htmlReporter.config().setReportName("BRIT Inventory Automated Test Reports");


    }

    @AfterTest
    public void tearDownTest() {
        report.flush();
    }

}
