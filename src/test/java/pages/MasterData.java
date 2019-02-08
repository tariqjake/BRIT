package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MasterData {

    public MasterData() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[2]/li[1]/a/span")
    public WebElement MasterDataProducts;

    public void clickProductsMasterData(){
        MasterDataProducts.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[2]/li[2]/a/span")
    public WebElement MasterDataReorderingRules;

    public void clickReorderingRulesButton(){
        MasterDataReorderingRules.click();
    }

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement ProductsSearchButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    public WebElement ReorderingRulesSearchButton;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/p/text()")
    public WebElement messageClickToDefineNewProduct;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    public void ChooseProduct(String ProductName) {
        String xpath = "(//div[@class='oe_kanban_global_click o_kanban_record'])["+ProductName+"]";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }

    public void ChooseOrder(int orderNumber) {
        String xpath =
                "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody/tr["+orderNumber+"]";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }




}
