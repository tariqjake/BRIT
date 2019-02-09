package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Pos_New_PosOrderPage {
    public Pos_New_PosOrderPage() { PageFactory.initElements(Driver.getDriver(), this); }
    //Using FindBy for locating elements

    @FindBy(how = How.XPATH,using = "/html/body/div[1]/div[2]/div[2]/div/div/div")
    public WebElement Inventory_Module;
    @FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div[2]/div/div/div/div[7]/div/div[1]/div[1]/div[1]/a/span")
    public WebDriver PosOrder_LinkButton;

    @FindBy(how=How.CLASS_NAME, using="btn btn-primary btn-sm o_list_button_add")
    public WebElement Create_Button;

    @FindBy(how=How.CLASS_NAME, using="o_input ui-autocomplete-input")
    public WebElement Partner_DropDown;

    @FindBy(how = How.XPATH,using = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/a")
    public WebElement Add_An_ItemPopUpMenu;

    @FindBy (how=How.CLASS_NAME,using= "btn btn-primary btn-sm o_form_button_save")
    public WebElement Save_button;
}

