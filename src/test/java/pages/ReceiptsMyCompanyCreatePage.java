package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReceiptsMyCompanyCreatePage {


    public ReceiptsMyCompanyCreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(linkText = "Add an item")
    public WebElement addAnItem;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement sourceBox;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget']")
    public WebElement valueOfSource;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement partnerDropdown;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[2]/a")
    public WebElement elementOfDropdown;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[5]")
    public WebElement clickDropdown;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[position()>0 and position()<7]/a")
    public List<WebElement> addItemElement;



}
