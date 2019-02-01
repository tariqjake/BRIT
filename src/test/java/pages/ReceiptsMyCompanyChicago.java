package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ReceiptsMyCompanyChicago {

    public ReceiptsMyCompanyChicago() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy (xpath = "//span[.='Receipts'][1]")
    public WebElement receipts;

    @FindBy (xpath = "(//div[@class='o_list_buttons']//button)[1]")
    public WebElement createButton;


}
