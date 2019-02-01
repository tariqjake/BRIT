package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class TransferPage {

    public TransferPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    WebElement createBtn;

    @FindBy (xpath = "//button[contains(text(),'Import')]")
    WebElement importBtn;

    @FindBy (xpath = "//span[@class='o_pager_limit']")
    WebElement totalNumberOfOperations;

    @FindBy (xpath = "//button[@accesskey = 's']")
    WebElement saveBtn;








}
