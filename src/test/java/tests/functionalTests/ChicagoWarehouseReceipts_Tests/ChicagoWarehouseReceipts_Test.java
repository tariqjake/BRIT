package tests.functionalTests.ChicagoWarehouseReceipts_Tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import javax.security.auth.login.Configuration;

public class ChicagoWarehouseReceipts_Test extends TestBase {

    public void commonSteps(ExtentTest extentLogger) {
        extentLogger.info("Logging in as a User");
        pages.login().loginManager();
        if(BrowserUtilities.isClickable(pages.homePage().inventoryMenu)) {
            extentLogger.info("Clicking on Inventory from the Menu");
            pages.homePage().inventoryMenu.click();
        }
    }


    //BRITE-2124 - "Create a partner, enter notes and save."
    @Test //pass
    public void Brite_2124(){
        extentLogger = report.createTest("Creating partner and verifying if it's displayed on Receipts page");
        commonSteps(extentLogger);

        pages.chicagoWarehousePage().receiptsPage.click();

        extentLogger.info("Clicking on Create button");
        pages.chicagoWarehousePage().createButton.click();

        extentLogger.info("Clicking on notes section & enter some notes");
        pages.chicagoWarehousePage().notesTab.click();
        pages.chicagoWarehousePage().notesTab.sendKeys("Internal notes about this query.");

        extentLogger.info("Saving the new product with notes");
        pages.chicagoWarehousePage().saveButton.click();

    }


    //BRITE-2126 - "Create an empty partner and verify odoo server error 'Please add some lines to move'"
    @Test //pass
    public void Brite_2126(){
        extentLogger = report.createTest("Verifying Odoo Server Error");
        commonSteps(extentLogger);

        pages.chicagoWarehousePage().receiptsPage.click();

        //fix click on createButton xpath
        extentLogger.info("Clicking on create button");
        pages.chicagoWarehousePage().createButton.click();

        extentLogger.info("Clicking on Validate button");
        pages.chicagoWarehousePage().validateButton.click();

        extentLogger.info("Verifing Odoo Server Error");
        String odooError = pages.chicagoWarehousePage().ServerErrorMessage.getText();
        Assert.assertEquals("Please add some lines to move", odooError);
    }

    //BRITE-2130 - "Verify Print & Action drop down list displays when a product(s) is selected"
    @Test //pass
    public void Brite_2130(){
        extentLogger = report.createTest("Verifying if Print & Action option is displayed when a product is selected");
        commonSteps(extentLogger);

        pages.chicagoWarehousePage().receiptsPage.click();

        extentLogger.info("checking the first checkbox");
        BrowserUtilities.selectCheckBox(pages.chicagoWarehousePage().firstCheckBox, true);

        extentLogger.info("verify Print & Action group is displayed");
        Assert.assertTrue(pages.chicagoWarehousePage().printActionGroup.isDisplayed());
    }

    //BRITE-2133 - "Verify 'Don't import'" is a default message on dropdown list"
    @Test //pass
    public void Brite_2133(){
        extentLogger = report.createTest("Verifying 'Don't import' is a default message");
        commonSteps(extentLogger);

        BrowserUtilities.wait(10);
        pages.chicagoWarehousePage().receiptsPage.click();

        extentLogger.info("Clicking on Import");
        pages.chicagoWarehousePage().importButton.click();

        extentLogger.info("Verifying 'Load File' is displayed");
        Assert.assertTrue(pages.chicagoWarehousePage().loadFile.isDisplayed());

    }

    //BRITE-2134 - - Edit the first order and enter a note
    @Test //pass
    public void Brite_2134(){
        extentLogger = report.createTest("Entering a note on existing product");
        commonSteps(extentLogger);

        pages.chicagoWarehousePage().receiptsPage.click();

        BrowserUtilities.wait(10);
        extentLogger.info("Clicking on the first product from the table");
        pages.chicagoWarehousePage().firstProduct.click();

        pages.chicagoWarehousePage().editButton.click();

        extentLogger.info("Clicking on Notes tab");
        pages.chicagoWarehousePage().notesTab.click();

        extentLogger.info("Entering some notes");
        String aMessage = "Pending query.";
        pages.chicagoWarehousePage().notesBox.clear();
        pages.chicagoWarehousePage().notesBox.sendKeys(aMessage);

        extentLogger.info("Clicking on save button");
        pages.chicagoWarehousePage().notesSaveButton.click();

        extentLogger.info("Verify Notes is saved & displayed");
        Assert.assertEquals(pages.chicagoWarehousePage().verifyNotes.getText(), aMessage);
        Assert.assertTrue(pages.chicagoWarehousePage().verifyNotes.isDisplayed());


    }


    //BRITE-2138 - Delete a Transfer under first product
    @Test //pass
    public void Brite_2138(){
        extentLogger = report.createTest("deleting computer case from a transaction");
        commonSteps(extentLogger);

        pages.chicagoWarehousePage().receiptsPage.click();

        extentLogger.info("Clicking on the first product from the table");
        pages.chicagoWarehousePage().firstProduct.click();

        extentLogger.info("Clicking on return button");
        pages.chicagoWarehousePage().returnButton.click();

        extentLogger.info("Deleting Computer case");
        pages.chicagoWarehousePage().deleteButton.click();

        extentLogger.info("Clicking on return button on pop up");
        pages.chicagoWarehousePage().returnPopUpButton.click();



    }


    //BRITE-2140 - Verify user can click on "Help" on import page
    @Test //pass
    public void Brite_2140(){
        extentLogger = report.createTest("Verify 'Help' is clickable");
        commonSteps(extentLogger);

        pages.chicagoWarehousePage().receiptsPage.click();

        extentLogger.info("Clicking on import button");
        pages.chicagoWarehousePage().importButton.click();

        extentLogger.info("Verifying if Help button is clickable");
       Assert.assertTrue(BrowserUtilities.isClickable(pages.chicagoWarehousePage().helpButton));
    }


    //BRITE-2170 - Verify user can do actions by clicking the 3 dot button
  @Test //pass
    public void Brite_2170(){
        extentLogger = report.createTest("Checking if actions show up when clicking 3 dots next to module");
        commonSteps(extentLogger);

        pages.chicagoWarehousePage().receiptsPage.click();

        extentLogger.info("Clicking on 3 dots");
        pages.chicagoWarehousePage().threeDots.click();

        extentLogger.info("Verifying 'Immediate Transfer' is clickable");
        Assert.assertTrue(BrowserUtilities.isClickable(pages.chicagoWarehousePage().immediateTransfer));

    }


    }
