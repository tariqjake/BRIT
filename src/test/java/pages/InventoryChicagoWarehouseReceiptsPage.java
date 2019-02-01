package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryChicagoWarehouseReceiptsPage {

    public InventoryChicagoWarehouseReceiptsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='o_primary']/a/span)[4]")
    public WebDriver clickOn;
}
