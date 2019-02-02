package utilities;

import pages.HomePage;
import pages.LoginPage;
import pages.SearchTransferPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private SearchTransferPage searchTransferPage;

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

    public SearchTransferPage searchTransferPage() {
        if (searchTransferPage == null) {
            searchTransferPage = new SearchTransferPage();
        }
        return searchTransferPage;
    }


}
