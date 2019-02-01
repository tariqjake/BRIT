package utilities;

import pages.HomePage;
import pages.LoginPage;
import pages.TransferPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private TransferPage transferPage;


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

    public TransferPage transfer() {
        if (transferPage == null) {
            transferPage = new TransferPage();
        }
        return transferPage;
    }



}
