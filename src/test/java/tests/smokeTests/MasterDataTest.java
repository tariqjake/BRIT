package tests.smokeTests;


import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;
import static org.testng.Assert.assertTrue;

public class MasterDataTest extends TestBase {

    public void commonSteps(ExtentTest extentLogger) {
        extentLogger.info("Logging in as a Manager");
        pages.login().loginManager();
        if(BrowserUtilities.isClickable(pages.homePage().inventoryMenu)) {
            extentLogger.info("Clicking on Inventory from the Menu");
            pages.homePage().inventoryMenu.click();
        }
    }

    //BRIT-2738
    @Test
    public void productPageTest(){

        extentLogger = report.createTest
                ("Page product page");
        commonSteps(extentLogger);

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

    //BRIT-2742
    @Test
    public void reorderingRulesTest(){

        extentLogger = report.createTest
                ("Page product page");
        commonSteps(extentLogger);

        extentLogger = report.createTest("Page Reordering rules test");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();

        extentLogger.info("Verifying title for 'Reordering rules' page");
        String reorderingRulesTitle = driver.getTitle();
        System.out.println(reorderingRulesTitle);
        assertTrue(reorderingRulesTitle.contains("Odoo"));

    }

}
