package tests.smokeTests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import utilities.Driver;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
;

public class Pos_NewOrderTest extends TestBase {
    /**
     * initializing the objects
     * TeseCase No BRIT -2094
     * verify that user should be able to place a new order
     *
     */
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Pos_NewOrderTest pos_NewOrderTest = new Pos_NewOrderTest();

    @BeforeMethod(description = "Login before proceed")
    public void login() {

        pages.login().loginUser();
        // BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();
    }

    @Test(description = "Verifying the title", priority =1)
    public void CreateNewTest() {
        extentLogger = report.createTest("PosOrder page");
        extentLogger.info("click on the Pos_OrderLink and navigate to the next page");
        pages.pos_New_PosOrderPage().PosOrder_Button.getTitle();
        assertEquals(pages.pos_New_PosOrderPage().PosOrder_Button, driver.getTitle());

    }

    @Test(description = "verifying that the create button is clickable", priority = 1)
    public void CreateNewOrder() {
        extentLogger = report.createTest("Page create test");
        extentLogger.info("Clicking 'create' button at the top of the page");
        pages.pos_New_PosOrderPage().Create_Button.click();
    }

    @Test(description = "verifying that the save button is clickable", priority = 2)
    public void SavebuttonTest() {
        extentLogger = report.createTest("click on the save button");
        extentLogger.info("click the save button and make sure the file is on the system");
        pages.pos_New_PosOrderPage().Save_button.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}