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
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ChicagoWarehousePage chicagoWarehousePage = new ChicagoWarehousePage();

    //BRIT-1155 - Verify Chicago Warehouse Receipts is visible in Inventory page
    @Test
    public void Brit_1155() {
        extentLogger = report.createTest("CWHR - Verify CWHR is displayed");
        extentLogger.info("Logging in to the application");
        loginPage.loginUser();

        extentLogger.info("Clicking on Inventory tab");
        homePage.inventoryMenu.click();

        extentLogger.info("Verifying Chicago Warehouse Receipts is displayed on inventory page");
        System.out.println(chicagoWarehousePage.ReceiptsModule.isDisplayed());
        Assert.assertTrue(chicagoWarehousePage.ReceiptsModule.isDisplayed());
    }

    //BRIT-2120 - Verify by clicking Chicago Warehouse Receipts user lands on 'Inventory / Chicago Warehouse: Receipts' page
    @Test
    public void Brit_2120(){
        extentLogger = report.createTest("Verify title");

        loginPage.loginUser();
       // BrowserUtilities.wait(3);
        homePage.inventoryMenu.click();

        extentLogger.info("Remember title of CWHR page");
        String titleCWHRModule = driver.getTitle();

        extentLogger.info("Clicking on CWHR page");
        chicagoWarehousePage.receiptsPage.click();

        extentLogger.warning("Verifying if the titles are not equal");
        Assert.assertNotEquals(titleCWHRModule, driver.getTitle());


    }

}
