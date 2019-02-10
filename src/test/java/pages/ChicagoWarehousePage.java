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

    //Brite-2124
    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

//    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
//    public WebElement partnerDropDown;
//
//    @FindBy(linkText = "Add an item")
//    public WebElement addAnItem;

    @FindBy(className = "o_field_float o_field_number o_field_widget o_input")
    public WebElement doneBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
    public WebElement validateButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    //Brite-2126
    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement ServerErrorMessage;

    //Brite - 2130
    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//div[@class='btn-group']")
    public WebElement printActionGroup;

    //Brite-2133
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFile;

    //Brite-2134
    @FindBy(xpath = "(//td[@class='o_data_cell o_readonly_modifier'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm o_form_button_edit'])")
    public WebElement editButton;

    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[4]/a")
    public WebElement notesTab;

    @FindBy(xpath = "//textarea[@class='o_field_text o_field_widget o_input']")
    public WebElement notesBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement notesSaveButton;

    @FindBy(xpath = "//span[@class='o_field_text o_field_widget']")
    public WebElement verifyNotes;


    //Brite -2138
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default'][2]")
    public WebElement returnButton;

    @FindBy(xpath = "(//button[@class='fa fa-trash-o o_list_record_delete_btn'])[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement returnPopUpButton;

    //Brite-2140
    @FindBy(linkText = "Help")
    public WebElement helpButton;

    //Brite-2170
    @FindBy(xpath = "(//a[@class='o_kanban_manage_toggle_button'])[5]")
    public WebElement threeDots;

    @FindBy(xpath = "(//a[@class=' oe_kanban_action oe_kanban_action_a'])[27]")
    public WebElement immediateTransfer;


}
