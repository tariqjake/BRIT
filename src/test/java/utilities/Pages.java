package utilities;

import pages.*;
import pages.ChicagoWarehouseDeliveryOrdersPage;
import tests.smokeTests.ChicagoWarehouseReceipts;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private MasterData masterData;
    private TransferPage transferPage;
    private ReceiptsMyCompanyPage receiptsMyCompanyPage;
    private DeliveryYourCompanyPage deliveryYourCompanyPage;
    private ChicagoWarehouseDeliveryOrdersPage chicagoWarehouseDeliveryOrdersPage;
    private ReceiptsMyCompanyChicagoPage receiptsMyCompanyChicagoPage;
    private ChicagoWarehousePage chicagoWarehousePage;

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

    public ChicagoWarehousePage chicagoWarehousePage() {
        if(chicagoWarehousePage == null){
            chicagoWarehousePage = new ChicagoWarehousePage();
        }
        return chicagoWarehousePage;
    }
}