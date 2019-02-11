package tests.functionalTests.InventorySearchTests;

public class testCases {

    /**
     *

     *
     *
     *         // ==========================================================================
     *
     *         @Test(description = "BRIT 1264")
     *         public void searchSaveButton() {
     *
     *             extentLogger = report.createTest("search has save button selection");
     *
     *             pages.login().loginManager();
     *             BrowserUtilities.wait(5);
     *             pages.homePage().inventoryMenu.click();
     *
     *             WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
     *             pages.searchTransferPage().searchSaveButton.click();
     *
     *             extentLogger.info("Verify the search button can save searched items on inventory");
     *             extentLogger.pass("Test Completed Successfully");
     *
     *         }
     *
     *
     *         }
     *
     *
     *         @Test(description = "BRIT 2552")
     *         public void searchArchivedSelectionButton() {
     *
     *             extentLogger = report.createTest("search has archived button selection");
     *
     *             pages.login().loginManager();
     *             BrowserUtilities.wait(5);
     *             pages.homePage().inventoryMenu.click();
     *
     *             WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
     *             pages.searchTransferPage().searchArchiveButtonSelected.click();
     *
     *             extentLogger.info("Verify the search has archived button ");
     *             extentLogger.pass("Test Completed Successfully");
     *
     *         }
     *
     *         @Test(description = "BRIT 2555")
     *         public void searchArchiveRomoveButton() {
     *
     *             extentLogger = report.createTest("search archived items removable ");
     *
     *             pages.login().loginManager();
     *             BrowserUtilities.wait(5);
     *             pages.homePage().inventoryMenu.click();
     *
     *             WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
     *             pages.searchTransferPage().getSearchArchiveButtonRemoved.click();
     *
     *             extentLogger.info("Verify that archived search items can removable ");
     *             extentLogger.pass("Test Completed Successfully");
     *
     *         }
     *
     */
}
