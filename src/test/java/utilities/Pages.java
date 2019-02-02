package utilities;

import pages.ChicagoWarehouseDeliveryOrders;
import pages.HomePage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private ChicagoWarehouseDeliveryOrders chicagoWarehouseDeliveryOrders;


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }



    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public ChicagoWarehouseDeliveryOrders chicagoWarehouseDeliveryOrders() {
        if (chicagoWarehouseDeliveryOrders == null) {
            chicagoWarehouseDeliveryOrders = new ChicagoWarehouseDeliveryOrders();
        }
        return chicagoWarehouseDeliveryOrders;
    }



}
