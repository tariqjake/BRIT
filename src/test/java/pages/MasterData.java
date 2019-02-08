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


    // Choose product
    public void ChooseProduct(String ProductName) {
        String xpath = "(//div[@class='oe_kanban_global_click o_kanban_record'])["+ProductName+"]";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }


    // Choose order
    public void ChooseOrder(int orderNumber) {
        String xpath =
                 "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody/tr["+orderNumber+"]";
         Driver.getDriver().findElement(By.xpath(xpath)).click();
    }

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBoxProducts;

    @FindBy(xpath = "//p[@class='oe_view_nocontent_create']")
    public WebElement click_to_define_a_new_product;
}
