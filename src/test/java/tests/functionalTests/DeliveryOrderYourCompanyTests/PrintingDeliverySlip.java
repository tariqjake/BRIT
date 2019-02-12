package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import static org.testng.Assert.fail;

public class PrintingDeliverySlip extends TestBase {


    @Test(description = "BRIT-2155 ")
    public void printingdeliveryslip(){

        extentLogger= report.createTest("Delivery order Printing delivery slips");
        extentLogger.info("Logging in to the application");

        pages.login().loginUser();

        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking on the inventory Module");
        pages.homePage().inventoryMenu.click();

        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().deliveryOrderDB);
        extentLogger.info("Clicking on the delivery yor company dashBoard");
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on one of the delivery orders listed ");
        pages.deliveryYourCompny().checkbox.click();

        extentLogger.info("Clicking on the print drop down");
        pages.deliveryYourCompny().printDropdown.click();

        extentLogger.info("clicking on the Delivery Slip from the print dropDown list");
        pages.deliveryYourCompny().deliverySlip.click();

        extentLogger.info("clicking on the print button to print the slip");
        pages.deliveryYourCompny().printButton.click();

        extentLogger.info("veryfing if the print button is  clickable");
        Assert.assertTrue(BrowserUtilities.isClickable(pages.deliveryYourCompny().printButton));
        extentLogger.pass("Test completed sucessfuly");



    }
}
