package utilities;

import pages.*;
import pages.ChicagoWarehouseDeliveryOrdersPage;
import pages.DeliveryYourCompanyPage;
import pages.HomePage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private MasterDataPage masterData;
    private TransferPage transferPage;
    private ReceiptsMyCompanyPage receiptsMyCompanyPage;
    private DeliveryYourCompanyPage deliveryYourCompanyPage;
    private ChicagoWarehouseDeliveryOrdersPage chicagoWarehouseDeliveryOrdersPage;
    private ReceiptsMyCompanyChicagoPage receiptsMyCompanyChicagoPage;
    private ReceiptsMyCompanyCreatePage createPage;
    private ReceiptsMyCompanyImportPage importPage;

    private Pos_New_PosOrderPage pos_New_PosOrderPage;
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

    public MasterDataPage masterData() {
        if (masterData == null) {
            masterData = new MasterDataPage();
        }
        return masterData;
    }


    public ChicagoWarehouseDeliveryOrdersPage chicagoWarehouseDeliveryOrders() {
        if (chicagoWarehouseDeliveryOrdersPage == null) {
            chicagoWarehouseDeliveryOrdersPage = new ChicagoWarehouseDeliveryOrdersPage();
        }
        return chicagoWarehouseDeliveryOrdersPage;
    }

    public DeliveryYourCompanyPage deliveryYourCompny() {
        if (deliveryYourCompanyPage == null) {
            deliveryYourCompanyPage = new DeliveryYourCompanyPage();
        }
        return deliveryYourCompanyPage;
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

    public ReceiptsMyCompanyCreatePage createPage(){
        if(createPage==null) {
            createPage = new ReceiptsMyCompanyCreatePage();
        }
        return createPage;
    }

    public ReceiptsMyCompanyImportPage importPage(){
        if(importPage==null){
            importPage=new ReceiptsMyCompanyImportPage();
        }
        return importPage;
    }

    public Pos_New_PosOrderPage pos_New_PosOrderPage() {
        if (pos_New_PosOrderPage == null) {
            pos_New_PosOrderPage = new Pos_New_PosOrderPage();
        }
        return pos_New_PosOrderPage;u
    }
}




