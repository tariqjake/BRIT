package utilities;

import pages.HomePage;
import pages.LoginPage;
import pages.ReceiptsMyCompanyPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private ReceiptsMyCompanyPage receiptsMyCompanyPage;


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

    public ReceiptsMyCompanyPage getReceiptsMyCompanyPage(){
        if(receiptsMyCompanyPage ==null){
            receiptsMyCompanyPage =new ReceiptsMyCompanyPage();
        }
        return receiptsMyCompanyPage;
    }

}
