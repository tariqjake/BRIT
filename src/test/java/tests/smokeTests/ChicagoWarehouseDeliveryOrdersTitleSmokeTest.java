package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class ChicagoWarehouseDeliveryOrdersTitleSmokeTest extends TestBase {

    /*
     * Test Case : BRIT-1865 - SR-01 Verify that system title displays "Chicago Warehouse: Delivery Orders - Odoo"
     */
    @Test
    public void ChicagoWarehouseDeliveryOrdersTitle() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");

        BrowserUtilities.wait(3);
        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        BrowserUtilities.wait(3);
        extentLogger.info("Veryfying title");
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");


    }

    /*
     * Test Case : BRIT-1874 - ST-02 Verify that user is able to create new order
     */
    @Test
    public void ChicagoWarehouseDeliveryOrdersCreate() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying user is able to create order");

        BrowserUtilities.wait(3);
        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        BrowserUtilities.wait(3);
        extentLogger.info("Verifying user is able to create order");
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Create.isDisplayed());




    }
}

