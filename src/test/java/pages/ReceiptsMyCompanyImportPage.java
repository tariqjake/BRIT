package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ReceiptsMyCompanyImportPage {

    public ReceiptsMyCompanyImportPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadfile;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement sendBoxFile;



}
