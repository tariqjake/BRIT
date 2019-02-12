package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChicagoWarehousePage {

    public ChicagoWarehousePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[3]")
//    public WebElement inventoryTab;

    @FindBy(xpath = "//div[@name='stock_picking'][4]")
    public WebElement ReceiptsModule;

    @FindBy(xpath = "(//div[@class='o_primary']/a)[4]")
    public WebElement receiptsPage;
}

