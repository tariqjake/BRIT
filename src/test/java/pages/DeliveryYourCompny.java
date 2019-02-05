package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Random;

public class DeliveryYourCompny {

    public DeliveryYourCompny() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Delivery Orders'])[1]")
    public WebElement deliveryOrderDB;

    @FindBy(xpath = "(//div[@class='o_list_buttons']//button)[1]")
    public WebElement createButton;


    @FindBy(xpath = "(//div[@class='o_list_buttons']//button)[2]")
    public WebElement importButton;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFileButton;

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

//    @FindBy(xpath = "//div[@class='modal-header']")
//    public  WebElement accesErrorMessage;

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
    public  WebElement messages;


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








}