package utilities;

import pages.DeliveryYourCompanyPage;
import pages.HomePage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private DeliveryYourCompanyPage deliveryYourCompny;

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

    public DeliveryYourCompanyPage deliveryYourCompny() {
        if (deliveryYourCompny == null) {
            deliveryYourCompny = new DeliveryYourCompanyPage();
        }
        return deliveryYourCompny;
    }





}
