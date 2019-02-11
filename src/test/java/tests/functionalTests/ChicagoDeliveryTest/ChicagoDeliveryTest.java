package tests.functionalTests.ChicagoDeliveryTest;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class ChicagoDeliveryTest extends TestBase {


    @Test
    public void ChicagoDeliveryCreate() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying user is able to create order");
        BrowserUtilities.wait(3);
        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();


        extentLogger.info("Verifying user is able to create order");
        BrowserUtilities.wait(3);
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Create.isDisplayed());


    }

    @Test
    public void ChicagoDeliveryReference() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();

        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Verifying user is able to see Reference");

        BrowserUtilities.wait(3);
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Reference.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryTitle() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        BrowserUtilities.wait(3);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        Thread.sleep(3000);
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();
        BrowserUtilities.wait(3);

        extentLogger.info("Verifying title");

        Assert.assertEquals(driver.getTitle(),"Chicago Warehouse: Delivery Orders - Odoo");


    }

    @Test
    public void ChicagoDeliveryPartner() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();

        BrowserUtilities.wait(3);

        pages.homePage().inventoryMenu.click();

        BrowserUtilities.wait(3);
        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        BrowserUtilities.wait(5);

        extentLogger.info("Veryfying user is able to see Partner");

        BrowserUtilities.waitForVisibility(pages.chicagoWarehouseDeliveryOrders().Partner,10);
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Partner.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryScheduledDate() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");

        BrowserUtilities.wait(3);
        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();


        extentLogger.info("Verifying user is able to see ScheduledDate");

        BrowserUtilities.wait(3);
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().ScheduledDate.isDisplayed());

    }

    @Test
    public void ChicagoDeliverySourceDocument() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();



        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");

        BrowserUtilities.wait(3);
        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();


        extentLogger.info("Veryfying user is able to see Source Document");

        BrowserUtilities.wait(3);
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().SourceDocument.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryBackOrderOf() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        BrowserUtilities.wait(3);

        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");
        BrowserUtilities.wait(3);

        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verifying user is able to see Back Order of");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().BackOrderof.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryRefernce() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        BrowserUtilities.wait(3);

        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");
        BrowserUtilities.wait(3);

        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        BrowserUtilities.wait(3);
        extentLogger.info("Verifying user is able to see Reference");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Status.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryImport() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();

        BrowserUtilities.wait(3);

        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");
        BrowserUtilities.wait(3);

        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verifying user is able to see Import");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Import.isDisplayed());

    }

    @Test
    public void ChicagoDeliverPartner() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        BrowserUtilities.wait(3);
        pages.homePage().inventoryMenu.click();

        BrowserUtilities.wait(3);

        extentLogger = report.createTest("Verifying user is able to see Partner");

        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();


        BrowserUtilities.wait(3);
        extentLogger.info("Veryfying user is able to see Partner");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Partner.isDisplayed());

    }


}

