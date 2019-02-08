package tests.functionalTests.ReceiptsMyCompanyChicagoTests;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class ReceiptsMyCompanyChicagoTests extends TestBase {


    public void commonSteps(ExtentTest extentLogger) {
        extentLogger.info("Logging in as a User");
        pages.login().loginUser();
        if(BrowserUtilities.isClickable(pages.homePage().inventoryMenu)) {
            extentLogger.info("Clicking on Inventory from the Menu");
            pages.homePage().inventoryMenu.click();
        }
    }


    /**
     * Test Case : BRIT-2447 - testing if Receipt "PO4567" can be edited with invalid client info (phone number)
     * Testing if manager can edit new created Receipt "PO4567" with invalid client info (phone number)
     */

    @Test (description = "Testing if manager can edit new created Receipt \"PO4567\" with invalid client info (phone number)")
    public void testingToEditReceiptsWithInvalidInfo(){

        extentLogger = report.createTest("Testing if Receipt \"PO4567\" can be edited with invalid client info (phone number)");
        commonSteps(extentLogger);

        extentLogger.info("Clicking on receipt module");
        pages.receiptsMyCompanyChicago().receipts.click();

        extentLogger.info("Clicking on receipt with number PO4567");
        pages.receiptsMyCompanyChicago().receiptNumber.click();

        extentLogger.info("Clicking on button Edit");
        pages.receiptsMyCompanyChicago().editButton.click();

        extentLogger.info("Click on \"Open partner\" button  \"Edit");
        pages.receiptsMyCompanyChicago().openPartnerButton.click();

        extentLogger.info("Entering invalid phone number");
        pages.receiptsMyCompanyChicago().phoneNumber.sendKeys("abc-erf-uytr");

        extentLogger.info("Clicking on Save button of Open Partner");
        pages.receiptsMyCompanyChicago().saveButtonPartner.click();

        extentLogger.info("Verify if error Message is displayed");
        String expectedErrorMessage = "Invalid phone number format";
        String actualText = pages.receiptsMyCompanyChicago().phoneNumber.getText();
        Assert.assertEquals(expectedErrorMessage, actualText);

    }




}
