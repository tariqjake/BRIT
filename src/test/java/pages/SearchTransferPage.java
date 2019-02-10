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

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public WebElement searchFilterButton;

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement clickButton;

    @FindBy(xpath = "//li[@class='o_add_filter o_closed_menu']")
    public WebElement searchAddCustomFilter;

   @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
   public WebElement searchGroupByButton;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement searchFavoritesButton;


    //================================================================

    @FindBy(xpath = "//a[.='Save current search']")
    public WebElement seachSaveButton;

    @FindBy(xpath = "//a[.='Add to my Dashboard']")
    public WebElement seachAddDashboard;

    @FindBy(linkText = "Archived")
    public WebElement searchArchiveButtonSelected;

    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement SearchArchiveButtonRemoved;



    public String getTitle(){
        return Driver.getDriver().getTitle();



}
}
