package tests.smokeTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChicagoWarehouseDeliveryOrders;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

public class ChicagoWarehouseDeliveryOrdersCreateSmokeTest1 {

    @Test(groups = "smoke")
    public void ChicagoWarehouseDeliveryOrdersCreate() throws InterruptedException {

        Driver.getDriver().get("http://52.39.162.23/web/database/selector");
        LoginPage loginPage= new LoginPage();
        loginPage.loginUser();
        HomePage homePage= new HomePage();

        WebDriverWait webDriverWait1= new WebDriverWait(Driver.getDriver(),10);
        webDriverWait1.until(ExpectedConditions.elementToBeClickable(homePage.inventoryMenu));

        homePage.inventoryMenu.click();
        ChicagoWarehouseDeliveryOrders chicagoWarehouseDeliveryOrders= new ChicagoWarehouseDeliveryOrders();
        chicagoWarehouseDeliveryOrders.ChicagoWareHouseDelivery.click();


        chicagoWarehouseDeliveryOrders.ChicagoWareHouseDelivery.click();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Inventory - Odoo");



    }
}

