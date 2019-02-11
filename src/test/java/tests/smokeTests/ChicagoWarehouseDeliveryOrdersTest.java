package tests.smokeTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

public class ChicagoWarehouseDeliveryOrdersTest extends TestBase {

    @Test
    public void ChicagoWarehouseDeliveryOrdersTitle() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait= new WebDriverWait(driver,10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();


        extentLogger.info("Veryfying title");
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");


    }

    @Test
    public void ChicagoWarehouseDeliveryOrdersCreate() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();

        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying user is able to create order");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();



        extentLogger.info("Verifying user is able to create order");
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Create.isDisplayed());




    }
}

