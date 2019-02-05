package tests.functionalTests.LoginTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class PositiveLoginTest extends TestBase {

    @Test(description = "Login with valid User Credentials")
    public void loginUser() {
        pages.login().loginUser();
        BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();
        Wait<WebDriver> wait = new FluentWait<>(Driver.getDriver());
        ((FluentWait<WebDriver>) wait).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);


    }

    @Test(description = "Login with valid Manager Credentials")
    public void loginManager() {

        pages.login().loginManager();
        BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();


    }
}
