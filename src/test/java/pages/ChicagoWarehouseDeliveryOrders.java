package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChicagoWarehouseDeliveryOrders {
    public void ChicagoWarehouseDeliveryOrders(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Delivery Orders']")
    public WebElement ChicagoWareHouseDelivery;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement Create;


}

