package utilities;

import pages.ChicagoWarehousePage;
import pages.HomePage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private  ChicagoWarehousePage chicagoWarehousePage;

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
//asdfa
    public ChicagoWarehousePage chicagoWarehousePage(){
        if (chicagoWarehousePage == null){
            chicagoWarehousePage = new ChicagoWarehousePage();
        }
        return chicagoWarehousePage;
    }

}
