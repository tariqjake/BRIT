package utilities;

import pages.*;
import pages.ChicagoWarehouseDeliveryOrdersPage;
import pages.DeliveryYourCompanyPage;
import pages.HomePage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private MasterData masterData;
    private TransferPage transferPage;
    private ReceiptsMyCompanyPage receiptsMyCompanyPage;
    private DeliveryYourCompanyPage deliveryYourCompanyPage;
    private ChicagoWarehouseDeliveryOrdersPage chicagoWarehouseDeliveryOrdersPage;
    private ReceiptsMyCompanyChicagoPage receiptsMyCompanyChicagoPage;

    private SearchTransferPage searchTransferPage;
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
    public MasterData masterData() {
        if (masterData == null) {
            masterData = new MasterData();
        }
            return masterData;
        }
    public ChicagoWarehouseDeliveryOrdersPage chicagoWarehouseDeliveryOrders() {
        if (chicagoWarehouseDeliveryOrdersPage == null) {
            chicagoWarehouseDeliveryOrdersPage = new ChicagoWarehouseDeliveryOrdersPage();
        }
        return chicagoWarehouseDeliveryOrdersPage;
    }




    public ReceiptsMyCompanyChicagoPage receiptsMyCompanyChicago() {
       if (receiptsMyCompanyChicagoPage == null){
           receiptsMyCompanyChicagoPage = new ReceiptsMyCompanyChicagoPage();
       }
       return receiptsMyCompanyChicagoPage;
    }
    public SearchTransferPage searchTransferPage() {
        if (searchTransferPage == null) {
            searchTransferPage = new SearchTransferPage();
        }
        return searchTransferPage;
    }

    public TransferPage transfer() {
        if (transferPage == null) {
            transferPage = new TransferPage();
        }
        return transferPage;
    }


    public ReceiptsMyCompanyPage getReceiptsMyCompanyPage(){
        if(receiptsMyCompanyPage ==null){
            receiptsMyCompanyPage =new ReceiptsMyCompanyPage();
        }
        return receiptsMyCompanyPage;
    }

}
