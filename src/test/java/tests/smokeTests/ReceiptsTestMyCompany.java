package tests.smokeTests;


import org.testng.Assert;
import org.testng.annotations.*;
import utilities.*;


/**
 * Test Cases Number:
 * 1-BRIT-3599
 * 2-BRIT-825, BRIT-827
 */
public class ReceiptsTestMyCompany extends TestBase {

    private String title = "My Company, Chicago: Receipts - Odoo";


    @BeforeMethod(description = "Login before proceed")
    public void login() {


        pages.login().loginUser();
        BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();
    }
    /**
     * Verify Receipts Title
     * 1.Open the browser
     * 2.Go to Url : http://52.39.162.23/web/database/selector
     * 3.Login as any valid Entry
     * 4.Click Inventory
     * 5.Click Receipts (My Company, Chigaco)
     * 6.Verify that title equals : My Company, Chicago: Receipts - Odoo
     */
    /**
     *  Test Cases Number:
     *  * 1-BRIT-3599
     */

    @Test(description = "Verifying the title", priority = 1)
    public void titleOfReceiptPage() {

        extentLogger=report.createTest("Title Verification");
        // 5.Click Receipts (My Company, Chigaco)
        extentLogger.info("Click the receipts link");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        BrowserUtilities.wait(4);
        //6.Verify that title contains  Receipts
        extentLogger.info("Verify the title that equal expected title");
        Assert.assertEquals(pages.getReceiptsMyCompanyPage().getTitle(), title);

    }

    /**
     * 1.Click create button
     * 2.Verify that add an Item button is displayed
     * 3.Verify that save button is displayed
     */
    /**
     * Test Cases Number:
     * 2-BRIT-825, BRIT-827
     */
    @Test
    public void createReceipts() {

        extentLogger=report.createTest("Verify Create and Save button are displayed");
        extentLogger.info("Click the receipts link");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        //BrowserUtilities.wait(2);

        extentLogger.info("Click Create Button");
        //1.Click create button
        pages.getReceiptsMyCompanyPage().createButton.click();
        //BrowserUtilities.wait(2);

        extentLogger.info("Verify that Add an Item is displayed");


        //2.Verify that add an Item button is clickable
        Assert.assertTrue(BrowserUtilities.isClickable(pages.getReceiptsMyCompanyPage().addAnItem));

        extentLogger.info("Verify that Save Button is clickable");
        //3.Verify that save button is clickable
        Assert.assertTrue(BrowserUtilities.isClickable(pages.getReceiptsMyCompanyPage().saveButton));




    }

}
