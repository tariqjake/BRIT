package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ReceiptsMyCompanyChicagoPage {

    public ReceiptsMyCompanyChicagoPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy (xpath = "//span[.='Receipts'][1]")
    public WebElement receipts;

    @FindBy (xpath = "(//div[@class='o_list_buttons']//button)[1]")
    public WebElement createButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[3]/td[5]")
    public WebElement receiptNumber;

    @FindBy (xpath = "//div[@class='o_form_buttons_view']//button[1]")
    public WebElement editButton;

    @FindBy (xpath = "//table[@class='o_group o_inner_group o_group_col_6']//button[1]")
    public WebElement openPartnerButton;

    @FindBy (xpath = "//*[@class='o_field_phone o_field_widget o_input']")
    public WebElement phoneNumber;

    @FindBy (xpath = "//div[@class='modal-footer']//button[1]/span")
    public WebElement saveButtonPartner;

    @FindBy (xpath = "//div[@class='o_form_buttons_edit']//button[1]")
    public WebElement saveButtonReceipt;




}
