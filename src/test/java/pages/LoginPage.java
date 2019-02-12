package pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Pages;
import utilities.TestBase;

public class LoginPage{

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[contains(.,'Demo')]")class='alert alert-danger']")
    public WebElement LoginErrorMsg
    @FindBy(id="password")
    public WebElement pass;

    @FindBy (xpath = "//button[contains(.,'Log in')]")
    public WebElement submitBtn;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement LoginErrorMsg;


    ;



    /**
     * Method to test login as a User with valid credentials
     */
    public void loginUser(){
        //Choose the project
        selectDemo.click();
        email.sendKeys(ConfigurationReader.getProperty("loginUser"));
        pass.sendKeys(ConfigurationReader.getProperty("passwordUser"));
        //Submit button click
        submitBtn.click();



    }

    /**
     * Method to test login as a Manager with valid credentials
     */

    public void loginManager(){
        //Choose the project
        selectDemo.click();
        email.sendKeys(ConfigurationReader.getProperty("loginManager"));
        pass.sendKeys(ConfigurationReader.getProperty("passwordManager") );
        //Submit button click
        submitBtn.click();

    }

    /**
     * Method to test login with wrong credentials.
     * @param mail
     * @param password
     */
    public void wrongCredentials(String mail, String password){
        //Choose the project
        selectDemo.click();
        email.sendKeys(mail);
        pass.sendKeys(password);
        //Submit button click
        submitBtn.click();
    }



}
