package tests.functionalTests.MasterDataTests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MasterDataTests extends TestBase {

    public void commonSteps(ExtentTest extentLogger) {
        extentLogger.info("Logging in as a Manager");
        pages.login().loginManager();
        if(BrowserUtilities.isClickable(pages.homePage().inventoryMenu)) {
            extentLogger.info("Clicking on Inventory from the Menu");
            pages.homePage().inventoryMenu.click();
        }
    }

    //BRIT-2739
    @Test
    public void verifySearchBoxProduct(){
        extentLogger = report.createTest
                ("Page product page");
        commonSteps(extentLogger);

        extentLogger.info("Clicking 'Products' button on the left side of the webPage");
        pages.masterData().clickProductsMasterData();

        extentLogger.info("Verifying title for 'Products' page");
        String productsTitle = driver.getTitle();
        assertTrue(productsTitle.contains("Odoo"));
        extentLogger.info("Searching a non-existing product in search box");
        pages.masterData().ProductsSearchButton.sendKeys("cat"+ Keys.ENTER);

        extentLogger.info("Verifying message on the left side of the page:'Click to define a new product.'");
        String expectedMessage = "Click to define a new product.";
        String actualMessage = driver.findElement
                (By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/p/text()")).getText();//check xpath
        assertEquals(expectedMessage,actualMessage);

    }

    //BRIT-2740
    @Test
    public void createNewProduct(){
        extentLogger = report.createTest
                ("Create new product on product page");
        commonSteps(extentLogger);

        extentLogger.info("Clicking 'Products' button on the left side of the webPage");
        pages.masterData().clickProductsMasterData();

        extentLogger.info("Verifying title for 'Products' page");
        String productsTitle = driver.getTitle();
        assertTrue(productsTitle.contains("Odoo"));
        extentLogger.info("Searching a non-existing product in search box");
        pages.masterData().ProductsSearchButton.sendKeys("cat"+ Keys.ENTER);

        extentLogger.info("Clicking on create button on the left side of the 'Products' page");
        pages.masterData().createButton.click();


    }

    //BRIT-2744
    @Test
    public void reorderingPageRulesTest(){
        extentLogger = report.createTest
                ("Reordering Rules Page");
        commonSteps(extentLogger);

        extentLogger = report.createTest("Page Reordering rules test");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();

        extentLogger.info("Checking if 'Create' button is clickable");
        boolean clickableCreateButton = BrowserUtilities.isClickable(pages.masterData().createButton);
        assertTrue(clickableCreateButton);
        extentLogger.info("Checking if 'Import' button is clickable");
        boolean clickableImportButton = BrowserUtilities.isClickable(pages.masterData().importButton);
        assertTrue(clickableImportButton);

    }

}
