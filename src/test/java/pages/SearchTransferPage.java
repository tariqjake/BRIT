package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchTransferPage {

    public SearchTransferPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement searchClickable;

    @FindBy(xpath = "//span[@title]")
    public WebElement searchFilterClick;

    public String getTitle(){
        return Driver.getDriver().getTitle();

}
}
