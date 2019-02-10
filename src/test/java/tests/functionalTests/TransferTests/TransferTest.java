package tests.functionalTests.TransferTests;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class TransferTest extends TestBase {


    public void commonSteps(ExtentTest extentLogger) {
        extentLogger.info("Logging in as a User");
        pages.login().loginUser();
        if(BrowserUtilities.isClickable(pages.homePage().inventoryMenu)) {
            extentLogger.info("Clicking on Inventory from the Menu");
            pages.homePage().inventoryMenu.click();
        }
    }

    /**
     * Test Case : BRIT-1174 - checking to Save an Empty Stock
     */

    @Test(description = "Checking if it is possible to create an empty Stock Operation")
    public void checkingToSaveAnEmptyStock() {

        extentLogger = report.createTest("Checking if it is possible to create an empty Stock Operation");
        commonSteps(extentLogger);


        extentLogger.info("Clicking on Inventory from the Menu");
        pages.homePage().inventoryMenu.click();

        extentLogger.info("Clicking on \"Transfers\" under Operation");
        pages.homePage().transferLink.click();
        BrowserUtilities.waitUntilVisible(pages.transfer().importBtn);

        extentLogger.info("Clicking on \"Create\" Button");
        pages.transfer().createBtn.click();

        extentLogger.info("Clicking on \"Save\" Button");
        BrowserUtilities.isClickable(pages.transfer().saveBtn);
        pages.transfer().saveBtn.click();

        extentLogger.info("Verifying the \"Error\" message is displayed");
        Assert.assertTrue(pages.transfer().errorMsg.isDisplayed());

    }

    /**
     * Test Case : BRIT-1277 - checking the arrow to get the next page
     */

    @Test(description = "Verify the functionality of the page arrows displayed on top right of the \"Transfers\" page")
    public void checkArrowsForNextPage() {
        extentLogger = report.createTest("Checking if it is possible to create an empty Stock Operation");
        commonSteps(extentLogger);

        extentLogger.info("Clicking on Inventory from the Menu");
        pages.homePage().inventoryMenu.click();

        extentLogger.info("Clicking on \"Transfers\" under Operation");
        pages.homePage().transferLink.click();
        BrowserUtilities.waitUntilVisible(pages.transfer().createBtn);

        extentLogger.info("Verifying there are 80 tasks shown on current page");
        Assert.assertTrue(BrowserUtilities.getStringToNumber(pages.transfer().numberOfOperationsOnCurrentPage) == 80);

        extentLogger.info("Verifying there are more than 80 pages");
        Assert.assertTrue(BrowserUtilities.getStringToNumber(pages.transfer().totalNumberOfOperations) > 80);


        extentLogger.info("Clicking on \">\" for the next page ");
        BrowserUtilities.isClickable(pages.transfer().nextArrow);
        pages.transfer().nextArrow.click();

        extentLogger.info("Verifying the rest of the operations shown in the next page");
        Assert.assertTrue(BrowserUtilities.getStringToNumber(pages.transfer().numberOfOperationsOnCurrentPage)
                == BrowserUtilities.getStringToNumber(pages.transfer().totalNumberOfOperations));


    }


}
