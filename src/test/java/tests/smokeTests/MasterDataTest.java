package tests.smokeTests;


import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MasterDataTest extends TestBase {

    @Test
    public void productPageTest(){

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Page Products test");
        extentLogger.info("Clicking 'Products' button on the left side of the webPage");
        pages.masterData().clickProductsMasterData();

        extentLogger.info("Verifying title for Products' page");
        String productsTitle =driver.getTitle();
        assertTrue( productsTitle.contains("Odoo"));

//        extentLogger.info("Click on random product");
//        pages.masterData().ChooseProduct("Bose");
//        Thread.sleep(1000);
//
//        extentLogger.info("Verify that random product is chosen");

    }
    @Test
    public void reorderingRulesTest(){

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Page Reordering rules test");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();

        extentLogger.info("Verifying title for 'Reordering rules' page");
        String reorderingRulesTitle = driver.getTitle();
        System.out.println(reorderingRulesTitle);
        assertTrue(reorderingRulesTitle.contains("Odoo"));

    }

}
