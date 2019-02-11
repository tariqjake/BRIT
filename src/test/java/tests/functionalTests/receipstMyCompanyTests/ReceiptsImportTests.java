package tests.functionalTests.receipstMyCompanyTests;


import org.testng.Assert;
import org.testng.annotations.*;
import utilities.*;


/**
 * Test Case : BRIT - 833
 * Test Case : BRIT - 834
 */
public class ReceiptsImportTests extends TestBase {

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
     * Click Import button
     * Click load file
     * Verify that load file button is clickable
     */
    /**
     * Test Case : BRIT - 833
     */


    @Test(priority = 1)
    public void fileButton() {
        extentLogger = report.createTest("Verify that source box accept key. ");
        extentLogger.info("Click Receipts (My Company, Chicago)");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        extentLogger.info("Click import button");
        pages.getReceiptsMyCompanyPage().importButton.click();

        extentLogger.info("Verify that load file is clickable");
        Assert.assertTrue(pages.importPage().loadfile1.isDisplayed());
        extentLogger.info("Click load file");


    }

    /**
     * 1.Open the browser
     * 2.Go to Url : http://52.39.162.23/web/database/selector
     * 3.Login as any valid Entry
     * 4.Click Inventory
     * 5.Click Receipts (My Company, Chicago)
     * Click Import button
     * Click load file
     * Select file from computer
     * Verify that file uploaded successfully.
     */
    /**
     * Test Case : BRIT - 834
     */

    @Test(priority = 2)
    public void fileUploadVerify() {

        extentLogger = report.createTest("Verify that source box accept key. ");
        extentLogger.info("Click Receipts (My Company, Chicago)");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        extentLogger.info("Click import button");
        pages.getReceiptsMyCompanyPage().importButton.click();


        String cwd=System.getProperty("user.dir");
        String path = "/src/Files/firstTestCase.xlsx";

        String fileLocation = cwd + path;

        BrowserUtilities.wait(3);
        extentLogger.info("Send path to the website");
        pages.importPage().loadfile.sendKeys(fileLocation);


       BrowserUtilities.wait(3);
        extentLogger.info("Verify that file uploaded");
       Assert.assertTrue(pages.importPage().importButton.isEnabled());


    }


}