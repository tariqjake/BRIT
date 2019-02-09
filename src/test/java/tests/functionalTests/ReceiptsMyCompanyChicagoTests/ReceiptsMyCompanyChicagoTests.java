package tests.functionalTests.ReceiptsMyCompanyChicagoTests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ReceiptsMyCompanyChicagoTests extends TestBase {


    public void commonSteps(ExtentTest extentLogger) {
        extentLogger.info("Logging in as a User");
        pages.login().loginUser();
        if(BrowserUtilities.isClickable(pages.homePage().inventoryMenu)) {
            extentLogger.info("Clicking on Inventory from the Menu");
            pages.homePage().inventoryMenu.click();

            extentLogger.info("Clicking on receipt module");
            pages.receiptsMyCompanyChicago().receipts.click();
            BrowserUtilities.waitUntilVisible(pages.receiptsMyCompanyChicago().receipts);
        }
    }


    /**
     * Test Case : BRIT-2447 - testing if Receipt "PO4567" can be edited with invalid client info (phone number)
     */

    @Test (description = "Testing if manager can edit new created Receipt \"PO4567\" with invalid client info (phone number)")
    public void testingToEditReceiptsWithInvalidInfo(){

        extentLogger = report.createTest("Testing if Receipt \"PO4567\" can be edited with invalid client info (phone number)");
        commonSteps(extentLogger);

        extentLogger.info("Clicking on receipt with number PO4567");
        pages.receiptsMyCompanyChicago().receiptNumber.click();

        extentLogger.info("Clicking on button Edit");
        pages.receiptsMyCompanyChicago().editButton.click();

        extentLogger.info("Click on \"Open partner\" button  \"Edit");
        pages.receiptsMyCompanyChicago().openPartnerButton.click();

        extentLogger.info("Deleting existing phone number");
        pages.receiptsMyCompanyChicago().phoneNumber.clear();

        extentLogger.info("Entering invalid phone number");
        pages.receiptsMyCompanyChicago().phoneNumber.sendKeys("abc-erf-uytr");

        extentLogger.info("Clicking on Save button of Open Partner");
        pages.receiptsMyCompanyChicago().saveButtonPartner.click();


        extentLogger.info("Click on \"Open partner\" button  \"Edit");
        pages.receiptsMyCompanyChicago().openPartnerButton.click();

        extentLogger.info("Verify if error Message is displayed");
        String actualText = pages.receiptsMyCompanyChicago().phoneNumber.getText();
        System.out.println(actualText);
        Assert.assertNotEquals("Invalid phone number format", actualText);


    }

    /**
     * Test Case : BRIT-2449 - Testing if receipt can be deleted
     */

    @Test (description = "Testing if as a manager can delete receipt")
    public void deleteReceipt(){

        extentLogger = report.createTest("Testing if receipt can be deleted");
        commonSteps(extentLogger);

        extentLogger.info("Click to select receipt \"e.g. 3456");
        pages.receiptsMyCompanyChicago().selectReceipt.click();
        BrowserUtilities.isClickable(pages.receiptsMyCompanyChicago().actionList);

        extentLogger.info("Push button \"Action\" on a middle top");
        pages.receiptsMyCompanyChicago().actionButton.click();

        extentLogger.info("Choosing Delete");
        pages.receiptsMyCompanyChicago().actionList.click();

        String expectedDeleteMessage = "Are you sure you want to delete this record ?";
        String actualDeleteMessage = pages.receiptsMyCompanyChicago().deleteMessage.getText();
        Assert.assertEquals(expectedDeleteMessage, actualDeleteMessage);

    }

    /**
     * Test Case : BRIT-2451 - Testing if  receipt can be imported in "jpg" file
     */

    @Test (description = "Testing if  receipt can be imported in \"jpg\" file")
    public void jpgImportReceipt() {

        extentLogger = report.createTest("Testing if  receipt can be imported in \"jpg\" file");
        commonSteps(extentLogger);

        extentLogger.info("Push button \"Import\" in a right top corner");
        pages.receiptsMyCompanyChicago().importButton.click();

        extentLogger.info("Checking if page import page is open");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),
                "http://52.39.162.23/web?#view_type=list&model=stock.picking&action=491&active_id=6");

    }


    /**
     * Test Case : BRIT-2454 - Testing if receipt with "xlsx" file type can not be imported
     */

    @Test (description = "Testing if receipt with \"xlsx\" file type can not be imported")
    public void xlsxImportReceipt() {

        extentLogger = report.createTest("Testing if receipt with \"xlsx\" file type can not be imported");
        commonSteps(extentLogger);

        extentLogger.info("Push button \"Import\" in a right top corner");
        pages.receiptsMyCompanyChicago().importButton.click();

        extentLogger.info("Checking if page import page is open");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),
                "http://52.39.162.23/web?#view_type=list&model=stock.picking&action=491&active_id=6");

    }

    /**
     * Test Case : BRIT-2456 - Testing if receipts can be sorted by Status "Ready"
     */

    @Test (description = "Testing if receipts can be sorted by Status Ready")
    public void sortedReceipt() {

        extentLogger = report.createTest("Testing if receipts can be sorted by Status Ready");
        commonSteps(extentLogger);

        extentLogger.info("Remember status of the first receipt in a list");
        String draftStatus =  pages.receiptsMyCompanyChicago().draftStatus.getText();

        extentLogger.info("Clicking on sorting receipts");
        pages.receiptsMyCompanyChicago().statusButton.click();

        extentLogger.info("Verifying if status of the first receipt is Ready");
        String readyStatus = pages.receiptsMyCompanyChicago().readyStatus.getText();

        extentLogger.info("Checking if statuses are different");
        Assert.assertEquals(draftStatus, readyStatus);
        fail();

    }

    /**
     * Test Case : BRIT-2457 - Testing if receipts can be orginized by Kanaban
     */

    @Test (description = "Testing if receipts can be orginized by Kanban")
    public void orginizedKanbanReceipt() {

        extentLogger = report.createTest("Testing if receipts can be orginized by Kanban");
        commonSteps(extentLogger);

        extentLogger.info("Checking if button Kanban is clickable");
        Assert.assertTrue(BrowserUtilities.isClickable(pages.receiptsMyCompanyChicago().kanbanButton));
    }

    /**
     * Test Case : BRIT-2458 - Testing if  all receipts can be selected
     */

    @Test (description = "Testing if  all receipts can be selected")
    public void selectAllReceipts() {

        extentLogger = report.createTest("Testing if  all receipts can be selected");
        commonSteps(extentLogger);

        extentLogger.info("Checking if select all References is clickable");
        Assert.assertTrue(BrowserUtilities.isClickable(pages.receiptsMyCompanyChicago().referencesButton));
    }

    /**
     * Test Case : BRIT-2459 - Testing if receipts can be orginized by calandar
     */

    @Test (description = "Testing if receipts can be orginized by Calandar")
    public void orginizedCalandarReceipt() {

        extentLogger = report.createTest("Testing if receipts can be orginized by calandar");
        commonSteps(extentLogger);

        extentLogger.info("Checking if button Calandar is clickable");
        Assert.assertTrue(BrowserUtilities.isClickable(pages.receiptsMyCompanyChicago().calandarButton));
    }
}
