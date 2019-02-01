package utilities;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DeliveryYourCompny;
import pages.HomePage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private DeliveryYourCompny deliveryYourCompny;

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

    public DeliveryYourCompny deliveryYourCompny() {
        if (deliveryYourCompny == null) {
            deliveryYourCompny = new DeliveryYourCompny();
        }
        return deliveryYourCompny;
    }





}
