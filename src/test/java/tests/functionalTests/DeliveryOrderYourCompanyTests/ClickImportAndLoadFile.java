package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ClickImportAndLoadFile extends TestBase {


    @Test(description = "BRITE-1038")
    public void ClickImportAndLoadFile () {


        extentLogger = report.createTest("DeliveryOrder Click On Import And Load File test");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on the Import button");
        pages.deliveryYourCompny().importButton.click();


        String user = System.getProperty("user.dir");
        String path = "/src/FileUpload/SalesJan2009.csv";

        String fullpath = user + path;

        BrowserUtilities.wait(4);

        //file upload happens here
        pages.deliveryYourCompny().loadFileButton.sendKeys(fullpath);


        BrowserUtilities.wait(3);
        Assert.assertTrue(pages.deliveryYourCompny().clickImport.isEnabled());

        extentLogger.info("Test Completed sucessfully");



    }

}
