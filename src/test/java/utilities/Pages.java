package utilities;

import pages.ChicagoWarehouseDeliveryOrders;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DeliveryYourCompny;
import pages.HomePage;
import pages.LoginPage;
import pages.TransferPage;
import pages.ReceiptsMyCompanyPage;
import pages.MasterData;
import pages.ReceiptsMyCompanyChicago;
import pages.SearchTransferPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private MasterData masterData;
    private TransferPage transferPage;
    private ReceiptsMyCompanyPage receiptsMyCompanyPage;
    private DeliveryYourCompny deliveryYourCompny;
    private ChicagoWarehouseDeliveryOrders chicagoWarehouseDeliveryOrders;
    private ReceiptsMyCompanyChicago receiptsMyCompanyChicago;

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

    public ChicagoWarehouseDeliveryOrders chicagoWarehouseDeliveryOrders() {
        if (chicagoWarehouseDeliveryOrders == null) {
            chicagoWarehouseDeliveryOrders = new ChicagoWarehouseDeliveryOrders();
        }
        return chicagoWarehouseDeliveryOrders;
    }

    public DeliveryYourCompny deliveryYourCompny() {
        if (deliveryYourCompny == null) {
            deliveryYourCompny = new DeliveryYourCompny();
        }
        return deliveryYourCompny;
    }


    public ReceiptsMyCompanyChicago receiptsMyCompanyChicago() {
       if (receiptsMyCompanyChicago == null){
           receiptsMyCompanyChicago = new ReceiptsMyCompanyChicago();
       }
       return receiptsMyCompanyChicago;
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
