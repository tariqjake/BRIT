package tests.functionalTests.TransferTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class ChicagoDeliveryTest extends TestBase {



    @Test
    public void ChicagoDeliveryReference() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Verifying user is able to see Reference");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Reference.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryTitle() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait= new WebDriverWait(driver,10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        Thread.sleep(5);
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();


        extentLogger.info("Verifying title");
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");


    }

    @Test
    public void ChicagoDeliveryPartner() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Veryfying user is able to see Partner");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Partner.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryScheduledDate() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Verifying user is able to see ScheduledDate");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().ScheduledDate.isDisplayed());

    }

    @Test
    public void ChicagoDeliverySourceDocument() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Veryfying user is able to see Source Document");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().SourceDocument.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryCreate() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();

        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying user is able to create order");


        extentLogger.info("Opening module");
        Thread.sleep(5);
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();


        extentLogger.info("Verifying user is able to create order");
        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Create.isDisplayed());

    }

    @Test
    public void ChicagoDeliveryStatus() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Verifying user is able to see Reference");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Status.isDisplayed());

    }


    @Test
    public void ChicagoDeliveryImport() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Verifying user is able to see Import");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Import.isDisplayed());

    }

    @Test
    public void ChicagoDelivery10() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

    }


    @Test
    public void ChicagoDeliverPartner() throws InterruptedException {

        driver.get("http://52.39.162.23/web/database/selector");

        pages.login().loginUser();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        pages.homePage().inventoryMenu.click();

        extentLogger = report.createTest("Verifying titles");


        extentLogger.info("Opening module");
        pages.chicagoWarehouseDeliveryOrders().ChicagoWareHouseDelivery.click();

        extentLogger.info("Veryfying user is able to see Partner");

        Assert.assertTrue(pages.chicagoWarehouseDeliveryOrders().Partner.isDisplayed());

    }


}

