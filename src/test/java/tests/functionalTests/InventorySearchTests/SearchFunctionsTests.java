package tests.functionalTests.InventorySearchTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

public class SearchFunctionsTests extends TestBase{


    public void easySteps(){

        extentLogger = report.createTest("search has filter button");
        pages.login().loginManager();
        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        pages.homePage().inventoryMenu.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains("stock.picking.typ"));
        pages.searchTransferPage().searchFilterClick.click();
    }


        @Test(description = "BRIT 1256")
        public void searchFilterButton() {
        easySteps();

        pages.searchTransferPage().searchFilterButton.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search button has filter button");
        extentLogger.pass("Test Completed Successfully");

        }

        @Test(description = "BRIT 1259")
        public void searchGroupByButton() {
        easySteps();

        pages.searchTransferPage().searchGroupByButton.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search button has group By filter button");
        extentLogger.pass("Test Completed Successfully");


        }

        @Test(description = "BRIT 1261")
        public void searchAddCustomFilter() {
        easySteps();

        pages.searchTransferPage().searchFilterButton.click();
        BrowserUtilities.wait(3);

        pages.searchTransferPage().searchAddCustomFilter.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search button has custom filter selection");
        extentLogger.pass("Test Completed Successfully");


    }


        @Test(description = "BRIT 1262")
        public void searchFavorites() {
        easySteps();

        BrowserUtilities.wait(2);
        pages.searchTransferPage().searchFavoritesButton.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search button has favorites selection");
        extentLogger.pass("Test Completed Successfully");


    }


        @Test(description = "BRIT 2552")
        public void searchArchivedSelectionButton() {
        easySteps();
        BrowserUtilities.wait(2);

        pages.searchTransferPage().searchFilterButton.click();
        BrowserUtilities.wait(3);

        pages.searchTransferPage().searchArchiveButtonSelected.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search has archived button");
        extentLogger.pass("Test Completed Successfully");


    }

        @Test(description = "BRIT 1264")
        public void saveCurrentSearch() {
        easySteps();

        pages.searchTransferPage().searchFavoritesButton.click();
        BrowserUtilities.wait(3);

        pages.searchTransferPage().seachSaveButton.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search button can save searched items on inventory");
        extentLogger.pass("Test Completed Successfully");


    }

        @Test(description = "BRIT 1265")
        public void searchAddDashBoard() {
        easySteps();

        pages.searchTransferPage().searchFavoritesButton.click();
        BrowserUtilities.wait(3);

        pages.searchTransferPage().seachAddDashboard.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search button can add searched items on dashboard");
        extentLogger.pass("Test Completed Successfully");


    }

        @Test(description = "BRIT 2555")
        public void searchArchiveRomoveButton() {
        easySteps();

        pages.searchTransferPage().searchFilterButton.click();
        BrowserUtilities.wait(3);

        pages.searchTransferPage().searchArchiveButtonSelected.click();
        BrowserUtilities.wait(3);

        pages.searchTransferPage().SearchArchiveButtonRemoved.click();
        BrowserUtilities.wait(3);
        extentLogger.info("Verify the search has archived button");
        extentLogger.pass("Test Completed Successfully");


    }
}


