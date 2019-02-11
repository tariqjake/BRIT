package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MasterDataPage {

    public MasterDataPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[2]/li[1]/a/span")
    public WebElement masterDataProducts;

    public void clickProductsMasterData() {
        masterDataProducts.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[2]/li[2]/a/span")
    public WebElement masterDataReorderingRules;

    public void clickReorderingRulesButton() {
        masterDataReorderingRules.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    public WebElement reorderingRulesSearchButton;

    @FindBy(xpath = "//p[@class='oe_view_nocontent_create']")
    public WebElement messageClickToDefineNewProduct;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[2]")
    public WebElement newReorderingRulesTag;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[2]")
    public WebElement productNameOnReorderingPage;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button/span")
    public WebElement actionButtonReorderingPage;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[1]/td[1]")
    public WebElement checkBoxFirstProduct;

    @FindBy(xpath = "//a[@data-index]")
    public List<WebElement> actionButtonOptions;

    @FindBy(xpath = "//li[contains(text(),'Products')]")
    public WebElement productsTagOnProductsPage;


    public void ChooseProduct(String ProductName) {
        String xpath = "(//div[@class='oe_kanban_global_click o_kanban_record'])[" + ProductName + "]";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }

    public void ChooseOrder(int orderNumber) {
        String xpath =
                "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody/tr[" + orderNumber + "]";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }


}
