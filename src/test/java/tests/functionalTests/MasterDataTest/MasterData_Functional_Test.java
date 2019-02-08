package tests.functionalTests.MasterDataTest;

import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

import static org.testng.Assert.assertTrue;

public class MasterData_Functional_Test extends TestBase {


    //BRIT-2739
    @Test
    public void verify_search_box_products(){
        pages.login().loginManager();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Page Products test");
        extentLogger.info("Clicking 'Products' button on the left side of the webPage");
        pages.masterData().clickProductsMasterData();
        BrowserUtilities.wait(3);

        extentLogger.info("Verifying title for Products' page");
        String productsTitle =driver.getTitle();
        assertTrue( productsTitle.contains("Odoo"));

        extentLogger.info("Searching a non-existing product in search box");
        pages.masterData().searchBoxProducts.sendKeys("cat");


    }
}
