package tests.functionalTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.Pages;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class Pos_Order_FunctionalTest extends TestBase {

      HomePage homePage=new HomePage();
      LoginPage loginPage=new LoginPage();
      
@Test(description = "verify that the inventory weblink in click able")
    public HomePage getHomePage() {
    extentLogger=report.createTest("Inventory weblink is cclickable");
    extentLogger.info("Inventory module is click able");
    pages.homePage().inventoryMenu.click();
    pages.homePage().inventoryMenu.isDisplayed();
    Assert.assertEquals("http://52.39.162.23/web/database", driver.getCurrentUrl());
    return homePage;
    }


    public LoginPage getLoginPage() {
        extentLogger=report.createTest("As a user i should be able to login");
        extentLogger.info("verify that the login will work with valid email and password");
        loginPage.email.sendKeys("in@info.com");
        loginPage.pass.sendKeys("alsfuh7we67");
        loginPage.submitBtn.click();
        return loginPage;
    }

    @Test(description = "Verify that the Inventory Module should contain the PosOrder functionality linkButton")
    public void InventoryTest() {
       extentLogger=report.createTest("the PosOrder should be displayed in the Inventory Module ");
       extentLogger.info("Inventory module should contain POsOrder linkButton");
       pages.pos_New_PosOrderPage().Inventory_Module.getText().contains("PosOrder");

    }
    @Test(description = "Verify that the Inventory Module should contain the PosOrder functionality linkButton")
    public void PosOrderTEst() {
        extentLogger=report.createTest("the PosOrder should be displayed in the Inventory Module ");
        extentLogger.info("Inventory module should contain POsOrder linkButton");
        pages.pos_New_PosOrderPage().PosOrder_LinkButton.
        pages.pos_New_PosOrderPage().Inventory_Module.getText().contains("PosOrder");

    }
    @Test(description = "Verify that the create button should be clickable ",priority = 1)
        public void Pos_Order_FunctionalTest() {

        extentLogger = report.createTest("create_button_Test ");
        extentLogger.info("click the create button");
        Driver.getDriver().getTitle().contains("Create");
        Assert.assertTrue(pages.pos_New_PosOrderPage().Create_Button.isDisplayed(),"create button is not displayed");
        System.out.println("create button is displayed");
        pages.pos_New_PosOrderPage().Create_Button.click();
    }
    @Test(description ="verify that the user should be able to save the form  ",priority = 2)
            public void SaveButton() {

        extentLogger = report.createTest("Save_button_Test ");
        extentLogger.info("the user should be able to see the filled form in the database");
        pages.pos_New_PosOrderPage().Save_button.click();
    }
   @Test(description = "The save button is enabled",priority = 2)
           public void SaveButtonEnabledTest(){

            extentLogger=report.createTest("buttonTest");
            extentLogger.info("Verifying that the save button is enabled");
        Assert.assertTrue(pages.pos_New_PosOrderPage().Inventory_Module.isDisplayed(),"Home Page heading is not displayed");
       System.out.println("PosOrder is displayed");
   }


}

