package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class TransferPage {

    public TransferPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    public WebElement createBtn;

    @FindBy (xpath = "//button[contains(text(),'Import')]")
    public WebElement importBtn;

    @FindBy (xpath = "//span[@class='o_pager_limit']")
    public WebElement totalNumberOfOperations;

    @FindBy (xpath = "//button[@accesskey = 's']")
    public WebElement saveBtn;

    @FindBy (xpath ="//div[@class = 'o_notification_manager']/*[contains(., 'fields')]")
    public WebElement errorMsg;

    @FindBy (xpath = "//span[@class='o_pager_value']")
    public WebElement numberOfOperationsOnCurrentPage;

    @FindBy (xpath = "//span[@class = 'btn-group btn-group-sm']/button[contains(@aria-label,'Next')]")
    public WebElement nextArrow;

    @FindBy (xpath = "//span[@class = 'btn-group btn-group-sm']/button[contains(@aria-label,'Previous')]")
    public WebElement previousArrow;










}
