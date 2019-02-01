package tests.smokeTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;

public class SmokeTestChicagoReceipts extends TestBase {

    @Test (description = "Test Case BRIT-2442")
    public void getAccessToMyCompanyChicago(){

        extentLogger = report.createTest("Verify titles");

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger.info("Remember title of Inventory Page");
        String  titleReceiptModule = driver.getTitle();

        extentLogger.info("Clicking on receipt module");
        pages.receiptsMyCompanyChicago().receipts.click();

        extentLogger.info("Verifying if the titles are not equals");
        Assert.assertNotEquals(titleReceiptModule, driver.getTitle());
        extentLogger.pass("Title verification test passed");
    }

    @Test (description = "Test Case BRIT-2445")
    public void managerCanCreateNewReceipt(){

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        BrowserUtilities.wait(3);

        extentLogger = report.createTest("Testing if manager can create receipt");

        extentLogger.info("Clicking on receipt module");
        pages.receiptsMyCompanyChicago().receipts.click();

        extentLogger.info("Clicking on create button");
        pages.receiptsMyCompanyChicago().createButton.click();

        extentLogger.info("Checking if button Create is clickable");
        Assert.assertTrue(BrowserUtilities.isClickable(pages.receiptsMyCompanyChicago().createButton));

        extentLogger.pass("Test successfully passed");

    }
}
