package tests.functionalTests;

import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class PositiveLoginTest extends TestBase {

    @Test(description = "Login with valid User Credentials")
    public void loginUser() {
        pages.login().loginUser();
        BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();


    }

    @Test(description = "Login with valid Manager Credentials")
    public void loginManager()  {

        pages.login().loginManager();
        BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();



    }
}
