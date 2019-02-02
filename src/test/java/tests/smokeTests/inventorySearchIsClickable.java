package tests.smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

public class inventorySearchIsClickable extends TestBase {

        @Ignore
        @Test (description = "BRIT 1240")
        public void searchClickTest () {

            extentLogger = report.createTest("Search is clickable");

            pages.login().loginManager();
            BrowserUtilities.wait(5);
            pages.homePage().inventoryMenu.click();

            BrowserUtilities.wait(5);
            //pages.searchTransferPage().searchClickable.click();
            BrowserUtilities.wait(5);
            pages.searchTransferPage().searchClickable.click();

            extentLogger.info("Verify the search button is clickable");
//          Assert.assertTrue(pages.searchTransferPage().searchClickable.isDisplayed());
//          extentLogger.pass("Test Completed Successfully");
        }




        @Test (description = "BRIT 1257")
        public void filterButtonIsClickable () {

            extentLogger = report.createTest("search filter is clickable");

            pages.login().loginManager();
            BrowserUtilities.wait(5);
            pages.homePage().inventoryMenu.click();

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            pages.searchTransferPage().searchFilterClick.click();

           extentLogger.info("Verify the filter button is clickable");
//            Assert.assertTrue(pages.searchTransferPage().searchFilterClick.isDisplayed());
//            extentLogger.pass("Test Completed Successfully");


        }


    }




