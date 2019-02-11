package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChicagoWarehouseDeliveryOrdersPage {
    public ChicagoWarehouseDeliveryOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='oe_kanban_color_2 o_kanban_record']//span[.='Delivery Orders']")
    public WebElement ChicagoWareHouseDelivery;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement Create;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement Reference;

    @FindBy(xpath = "//th[text()='Partner']")
    public WebElement Partner;

    @FindBy(xpath = "//th[text()='Scheduled Date']")
    public WebElement ScheduledDate;

    @FindBy(xpath = "//th[text()='Source Document']")
    public WebElement SourceDocument;

    @FindBy(xpath = "//th[text()='Back Order of']")
    public WebElement BackOrderof;

    @FindBy(xpath = "//th[text()='Status']")
    public WebElement Status;

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement Import;



}

