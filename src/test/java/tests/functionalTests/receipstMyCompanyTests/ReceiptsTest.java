package tests.functionalTests.receipstMyCompanyTests;


import org.testng.Assert;
import org.testng.annotations.*;
import utilities.*;
import java.util.*;

/**
 * Test Case : BRIT - 804
 * Test Case : BRIT - 802
 */

public class ReceiptsTest extends TestBase {


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
     * Click randomly any checkbox
     * Verify that checkbox is selected.
     */
    /**
     * Test Case : BRIT - 804
     */

    @Test(priority = 1)
    public void receiptsTest() {

        extentLogger = report.createTest("Verify that check boxes are selectable");

        extentLogger.info("Click Receipts (My Company, Chicago)");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        extentLogger.info("Click randomly any checkbox");
        int random = (int) (Math.random() * 5 + 1);
        pages.getReceiptsMyCompanyPage().checkboxes.get(random).click();

        extentLogger.info("Verify that checkbox is selected.");
        Assert.assertTrue(pages.getReceiptsMyCompanyPage().checkboxes.get(random).isSelected());


    }

    /**
     * 1.Open the browser
     * 2.Go to Url : http://52.39.162.23/web/database/selector
     * 3.Login as any valid Entry
     * 4.Click Inventory
     * 5.Click Receipts (My Company, Chicago)
     * Click header
     * Verify that when clicking header options list is sorted
     */

    /**
     * Test Case : BRIT - 802
     */
    @Test(priority = 2)
    public void sortTest() {
        extentLogger = report.createTest("Verify that when clicking header options list is sorted");

        extentLogger.info("Click Receipts (My Company, Chicago)");
        pages.getReceiptsMyCompanyPage().receiptsLink.click();

        extentLogger.info("Click reference header");
        pages.getReceiptsMyCompanyPage().headerReference.click();

        extentLogger.info("Verify that list is sorted");
        int array[] = new int[pages.getReceiptsMyCompanyPage().referenceList.size()];
        int j = 0;
        for (int i = 0; i < pages.getReceiptsMyCompanyPage().referenceList.size() - 1; i++) {

            int a = Integer.parseInt(pages.getReceiptsMyCompanyPage().referenceList.get(i).getText().substring(12));

            array[j] = a;
            j++;
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            Assert.assertTrue(array[i] < array[i + 1]);
        }
    }

}
