package tests.smokeTests;

import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class TransferTest extends TestBase {

    @BeforeMethod(description = "Login before proceed")
    public void login() {


        pages.login().loginUser();
        BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();
    }



}
