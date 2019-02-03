package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChicagoWarehousePage;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;


public class ChicagoWarehouseReceipts extends TestBase {


    //BRIT-1155 - Verify Chicago Warehouse Receipts is visible in Inventory page
    @Test
    public void Brit_1155() {
        extentLogger = report.createTest("CWHR - Verify CWHR is displayed");
        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        extentLogger.info("Clicking on Inventory tab");
        pages.homePage().inventoryMenu.click();

        extentLogger.info("Verifying Chicago Warehouse Receipts is displayed on inventory page");
        System.out.println(pages.chicagoWarehousePage().ReceiptsModule.isDisplayed());
        Assert.assertTrue(pages.chicagoWarehousePage().ReceiptsModule.isDisplayed());
    }

    //BRIT-2120 - Verify by clicking Chicago Warehouse Receipts user lands on 'Inventory / Chicago Warehouse: Receipts' page
    @Test
    public void Brit_2120(){
        extentLogger = report.createTest("Verify title");

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger.info("Remember title of CWHR page");
        String titleCWHRModule = driver.getTitle();

        extentLogger.info("Clicking on CWHR page");
        pages.chicagoWarehousePage().receiptsPage.click();

        extentLogger.warning("Verifying if the titles are not equal");
        Assert.assertNotEquals(titleCWHRModule, driver.getTitle());


    }

}
