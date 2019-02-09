package tests.functionalTests.receipstMyCompanyTests;


import org.testng.Assert;
import org.testng.annotations.*;
import utilities.*;

/**
 * Test Case : BRIT - 824
 * Test Case : BRIT - 823
 * Test Case : BRIT - 825
 */
public class ReceiptsCreateTest extends TestBase {

    @BeforeMethod(description = "Login before proceed")
    public void login() {

        pages.login().loginUser();
        BrowserUtilities.waitForVisibility(pages.homePage().inventoryMenu, 10);
        pages.homePage().inventoryMenu.click();
    }

    /**
     * 1.Open the browser
     * 2.Go to Url : http://52.39.162.23/web/database/selector
     * 3.Login as any valid Entry
     * 4.Click Inventory
     * 5.Click Receipts (My Company, Chicago)
     * Click Source document
     * Verify that source box accept key.
     */
    /**
     * Test Case : BRIT - 824
     */

    @Test(priority = 1)
    public void sourceBoxTest() {
        extentLogger = report.createTest("Verify that source box accept key. ");
        extentLogger.info("Click Receipts (My Company, Chicago)");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        extentLogger.info("Click Create Button");
        pages.getReceiptsMyCompanyPage().createButton.click();

        extentLogger.info("Send key to the Source box");
        BrowserUtilities.waitForVisibility(pages.createPage().sourceBox, 5);
        pages.createPage().sourceBox.sendKeys("Test123");

        extentLogger.info("Click Save button");
        pages.createPage().saveButton.click();

        BrowserUtilities.waitForVisibility(pages.createPage().valueOfSource, 10);

        Assert.assertTrue(pages.createPage().valueOfSource.isDisplayed());

    }

    /**
     * 1.Open the browser
     * 2.Go to Url : http://52.39.162.23/web/database/selector
     * 3.Login as any valid Entry
     * 4.Click Inventory
     * 5.Click Receipts (My Company, Chicago)
     * Click partner dropdown list
     * Select one option
     * Verify that option is selected.
     */
    /**
     * Test Case : BRIT - 823
     */

    @Test(priority = 2)
    public void partnerDropdown() {

        extentLogger = report.createTest("Verify that option is selected from dropdown list.. ");
        extentLogger.info("Click Receipts (My Company, Chicago)");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        extentLogger.info("Click Create Button");
        pages.getReceiptsMyCompanyPage().createButton.click();

        extentLogger.info("Click dropdown list");
        pages.createPage().partnerDropdown.click();

        extentLogger.info("Click one of the option on dropdown list");
        pages.createPage().elementOfDropdown.click();

        extentLogger.info("Verify that option is displayed");
        BrowserUtilities.waitForVisibility(pages.createPage().partnerDropdown, 5);

        Assert.assertTrue(pages.createPage().partnerDropdown.isDisplayed());

    }

    /**
     * 1.Open the browser
     * 2.Go to Url : http://52.39.162.23/web/database/selector
     * 3.Login as any valid Entry
     * 4.Click Inventory
     * 5.Click Receipts (My Company, Chicago)
     * Click create button
     * Click add an item button
     * Select one of the options from dropdown
     * Verify that option is displayed.
     */
    /**
     * Test Case : BRIT - 825
     */

    @Test(priority = 3)
    public void addAnItem() {
        extentLogger = report.createTest("Verify that option is selected from dropdown list.. ");
        extentLogger.info("Click Receipts (My Company, Chicago)");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        extentLogger.info("Click Create Button");
        pages.getReceiptsMyCompanyPage().createButton.click();

        extentLogger.info("click add an item");
        pages.createPage().addAnItem.click();

        BrowserUtilities.waitForVisibility(pages.createPage().clickDropdown,10);
        extentLogger.info("click dropdown");
        pages.createPage().clickDropdown.click();

        extentLogger.info("Click one of the element from add in item dropdown list");
        BrowserUtilities.wait(3);
        pages.createPage().addItemElement.get(4).click();

        extentLogger.info("Check option is selected");
        Assert.assertTrue(pages.createPage().addAnItem.isDisplayed());
    }

}
