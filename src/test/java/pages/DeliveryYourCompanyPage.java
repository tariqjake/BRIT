package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class DeliveryYourCompanyPage {

    public DeliveryYourCompanyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//span[.='Delivery Orders'])[1]")
    public WebElement deliveryOrderDB;

    @FindBy(xpath="(//div[@class='o_list_buttons']//button)[1]")
    public WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_list_buttons']//button)[2]")
    public WebElement importButton;

    @FindBy(xpath = "//input[@id='my-file-selector']")
    public WebElement loadFileButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_button o_import_import']")
    public WebElement clickImport;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement uploadBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    public WebElement checkbox;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement actiondropdown;

    @FindBy(xpath = "(//a[@data-section='other'])[2]")
    public WebElement delete;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']//span")
    public WebElement clickingConfrmationOK;

    @FindBy(xpath = "//div[@class='modal-header']//h4//span")
    public WebElement accesErrorMessage;



    @FindBy(xpath = "(//div[@class='o_searchview']//span)[1]")
    public WebElement glassSearch;


    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[3]//button/span[2]")
    public WebElement filter;

    public String randomFilter(WebDriver driver) {
        Random random = new Random();
        int x = random.nextInt(14) + 1;
        String xpath = "//ul[@class='dropdown-menu o_filters_menu']/li[" + x + "]";
        driver.findElement(By.xpath(xpath)).click();
        return driver.findElement(By.xpath(xpath)).getAttribute("innerText").trim();
    }

    @FindBy(xpath = "(//div[@class='o_facet_values'])[2]//span")
    public WebElement messages;


    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[4]//span[2]")
    public WebElement groupBy;


    public String randomGroupBy(WebDriver driver) {
        Random random = new Random();
        int x = random.nextInt(8) + 1;
        String path2 = "//ul[@class='dropdown-menu o_group_by_menu']/li[" + x + "]";
        driver.findElement(By.xpath(path2)).click();
        return driver.findElement(By.xpath(path2)).getAttribute("innerText").trim();
    }


    @FindBy(xpath = "//div//span[@class='o_pager_value']")
    public WebElement totalnumberDisplyed;

    @FindBy(xpath = "//button[@class='fa fa-chevron-left btn btn-icon o_pager_previous']")
    public WebElement previousNumber;


    @FindBy(xpath = "(//button[@class='fa fa-chevron-right btn btn-icon o_pager_next'])")
    public WebElement nextNumber;


    @FindBy(xpath = "//tbody//td[3]")
    public List<WebElement> ascending;


    public boolean isInOrder() {
        boolean restult = false;
        for (int i = 0; i < ascending.size() - 1; i++) {
            if (ascending.get(i).getText().compareTo(ascending.get(i + 1).getText()) < 0) {
                return true;
            }
        }
        return false;
    }


    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> organizingIcons;


    @FindBy(xpath = "(//div[@class='o_input_dropdown']//input)[1]")
    public WebElement partnerBox;


    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement sourceDocument;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;


    @FindBy(xpath = "//tbody//td[5]")
    public List<WebElement> sourceDocumntContent;

    public boolean isExists(){
        for (int i = 0; i < sourceDocumntContent.size()-1; i++) {
            if (sourceDocumntContent.get(i).getText().contains("WH001")||
                    sourceDocumntContent.get(i).getText().contains("")){
                return true;
            }

        }
        return false;
    }


    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public  WebElement printDropdown;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[3]//li[2]//a")
    public  WebElement deliverySlip;

    @FindBy(xpath = "//div[@class ='o_report_no_edit_mode']//button")
    public WebElement printButton;

    @FindBy(xpath = "//div[@class='o_notification_content']")
    public WebElement notifficationMEssage;





}