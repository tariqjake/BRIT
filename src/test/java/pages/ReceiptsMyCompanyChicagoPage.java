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

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[2]/td[1]")
    public WebElement selectReceipt;

    @FindBy (xpath = "//div[@class='btn-group']/div[2]/button")
    public WebElement actionButton;

    @FindBy (xpath = "//div[@class='btn-group']/div[2]/ul/li[2]")
    public WebElement actionList;

    @FindBy (xpath = "//*[@class='modal-body']")
    public WebElement deleteMessage;

    @FindBy (xpath = "//*[@class='o_list_buttons']//button[2]")
    public WebElement importButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr/td[7]")
    public WebElement draftStatus;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr/td[7]")
    public WebElement readyStatus;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[7]")
    public WebElement statusButton;

    @FindBy (xpath = "//*[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[2]")
    public WebElement kanbanButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[1]/div")
    public WebElement referencesButton;

    @FindBy (xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[3]")
    public WebElement calandarButton;

    @FindBy (xpath = "//div[@class='btn-group o_search_options']/div[1]/ul/li[5]")
    public WebElement doneStatus;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr/td[7]")
    public WebElement resultStatus;











}
