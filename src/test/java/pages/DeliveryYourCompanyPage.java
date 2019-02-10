package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeliveryYourCompanyPage {

    public DeliveryYourCompanyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//span[.='Delivery Orders'])[1]")
    public WebElement deliveryOrderDB;

    @FindBy(xpath="(//div[@class='o_list_buttons']//button)[1]")
    public WebElement createButton;




}
