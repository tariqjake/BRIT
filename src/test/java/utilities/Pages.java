package utilities;

import pages.HomePage;
import pages.LoginPage;
import pages.ReceiptsMyCompanyChicago;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private ReceiptsMyCompanyChicago receiptsMyCompanyChicago;


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

    public ReceiptsMyCompanyChicago receiptsMyCompanyChicago() {
       if (receiptsMyCompanyChicago == null){
           receiptsMyCompanyChicago = new ReceiptsMyCompanyChicago();
       }
       return receiptsMyCompanyChicago;
    }


}
