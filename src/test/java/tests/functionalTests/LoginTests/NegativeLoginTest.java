package tests.functionalTests.LoginTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class NegativeLoginTest extends TestBase {

    @Test(description = "Login with invalid User Credentials")
    public void loginUser() {

        extentLogger=report.createTest("Negative Login Test ");

        extentLogger.info("Using wrong email and password");
        pages.login().wrongCredentials("in2@information.com", "12345");
        pages.login().submitBtn.click();
        extentLogger.info("Verifying Error Message is Displayed");
        Assert.assertEquals(pages.login().LoginErrorMsg.getText(), "Wrong commonSteps/password");

        extentLogger.info("Screenshot with the error message");
        Assert.fail();
        BrowserUtilities.getScreenshot("Error Message");
        extentLogger.pass("Completed");


    }

}

