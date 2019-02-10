package tests.functionalTests.MasterDataTests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MasterDataTests extends TestBase {

    @BeforeMethod(description = "Login before proceed")
    public void login() {
        pages.login().loginManager();
        BrowserUtilities.wait(5);
        pages.homePage().inventoryMenu.click();
    }

    /**
     * BRIT-2739
     */
    @Test
    public void verifyTitleOfProductsPage() {
        extentLogger = report.createTest
                ("Page product page");
        BrowserUtilities.wait(15);
        extentLogger.info("Clicking 'Products' button on the left side of the webPage");
        pages.masterData().clickProductsMasterData();

        extentLogger.info("Verifying title for 'Products' page");
        String productsTitle = driver.getTitle();
        assertTrue(productsTitle.contains("Odoo"));

        extentLogger.info("Verifying message on the left side of the page:'Products'");
        String expectedMessage = "Products";
        String actualMessage = pages.masterData().productsTagOnProductsPage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    /**
     * BRIT-2740
     */
    @Test
    public void verifyingCreateButton() {
        extentLogger = report.createTest
                ("Verifying 'create' button is clickable on product page");

        extentLogger.info("Clicking 'Products' button on the left side of the webPage");
        pages.masterData().clickProductsMasterData();

        extentLogger.info("Clicking on create button on the left side of the 'Products' page");
        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 15);
        wait2.until(ExpectedConditions.urlContains("product.template"));
        pages.masterData().createButton.click();

        extentLogger.info("verifying title");
        String titleNewProduct = driver.getTitle();
        System.out.println(titleNewProduct);
        String expectedTitleNewProduct = "Products - Odoo";
        Assert.assertEquals(titleNewProduct, expectedTitleNewProduct);


    }

    /**
     * BRIT-2744
     */
    @Test
    public void reorderingRulesPageTest1() {
        extentLogger = report.createTest("Page Reordering rules 'create' button test");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();

        extentLogger.info("Checking if 'Create' button is clickable");
        boolean clickableCreateButton = BrowserUtilities.isClickable(pages.masterData().createButton);
        assertTrue(clickableCreateButton);

    }

    /**
     * BRIT-2747
     */
    @Test
    public void reorderingRulesPageTest2() {
        extentLogger = report.createTest
                ("Page Reordering Rules checking 'New' tag appears when you click create button");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();

        extentLogger.info("Checking that 'NEW' appears on the left side of the page when you click create button");
        pages.masterData().createButton.click();

        String newReorderingRulesTag = pages.masterData().newReorderingRulesTag.getText();
        System.out.println(newReorderingRulesTag);
        assertEquals(newReorderingRulesTag, "New");
    }

    /**
     * BRIT-2755
     */
    @Test
    public void verifyReorderingRulesSearchBox() {
        extentLogger = report.createTest("Page Reordering rules search box test");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();
        BrowserUtilities.wait(10);

        extentLogger.info("Checking that you can search existing product in search box");
        pages.masterData().reorderingRulesSearchButton.sendKeys("OP/00002" + Keys.ENTER);

        extentLogger.info("Checking if it is the same product that you entered in search box");
        assertEquals("OP/00002", pages.masterData().productNameOnReorderingPage.getText());

    }

    /**
     * BRIT-2749
     */
    @Test
    public void verifyActionButtonReorderingRules() {
        extentLogger = report.createTest("Page Reordering rules action button test");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();
        BrowserUtilities.wait(10);

        extentLogger.info("Clicking first product's checkbox");
        pages.masterData().checkBoxFirstProduct.click();

        extentLogger.info("Checking 'action' button appearing");
        assertTrue(BrowserUtilities.isClickable(pages.masterData().actionButtonReorderingPage));
    }

    /**
     * BRIT-2753
     */
    @Test
    public void checkActionDropdownOptions() {

        extentLogger = report.createTest("Page Reordering rules action button test with dropdown list");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();

        extentLogger.info("Clicking first product's checkbox");
        pages.masterData().checkBoxFirstProduct.click();

        extentLogger.info("Checking 'action' button has dropdown list");
        pages.masterData().actionButtonReorderingPage.click();

        extentLogger.info("Checking options in dropdown list");
        List<String> options = BrowserUtilities.getElementsText(pages.masterData().actionButtonOptions);

        List<String> expectedOptions = new ArrayList<>();
        expectedOptions.add("Export");
        expectedOptions.add("Archive");
        expectedOptions.add("Unarchive");
        expectedOptions.add("Delete");

        Assert.assertTrue(options.containsAll(expectedOptions));

    }

    /**
     * BRIT-2756
     */
    @Test
    public void verifyImportButtonIsClickable() {
        extentLogger = report.createTest("Page Reordering rules 'import' buttons test");
        extentLogger.info("Clicking 'Reordering rules' button on the left side of the webPage");
        pages.masterData().clickReorderingRulesButton();

        extentLogger.info("Checking if 'Import' button is clickable");
        boolean clickableImportButton = BrowserUtilities.isClickable(pages.masterData().importButton);

        assertTrue(clickableImportButton);
    }
}
