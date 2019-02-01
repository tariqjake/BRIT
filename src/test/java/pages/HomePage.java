package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a[contains(.,'Inventory')]")
    public WebElement inventoryMenu;

    @FindBy (xpath ="//span[contains(text(),'Transfers')]/..")
    WebElement transferLink;






}