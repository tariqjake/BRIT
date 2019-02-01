package utilities;

import pages.HomePage;
import pages.LoginPage;
import pages.MasterData;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private MasterData masterData;


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

    public MasterData masterData() {
        if (masterData == null) {
            masterData = new MasterData();
        }
        return masterData;
    }



}
