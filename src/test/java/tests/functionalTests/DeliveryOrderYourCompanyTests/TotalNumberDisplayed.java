package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import static org.testng.Assert.fail;

public class TotalNumberDisplayed extends TestBase {

    @Test(description = "BRIT=1100")
    public void totalNumber() {
        extentLogger = report.createTest("DeliveryOrder total number of order displayed");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().deliveryOrderDB);
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Check if the Total number of order is displyed");
        pages.deliveryYourCompny().totalnumberDisplyed.isDisplayed();

        extentLogger.info("Clicking on the sign > to see the pervious numbers");
        pages.deliveryYourCompny().previousNumber.click();

        extentLogger.info("verifiy  if total number of order is dispalyed");
        Assert.assertTrue(pages.deliveryYourCompny().totalnumberDisplyed.isDisplayed());
        extentLogger.pass("Test completed sucessfully");



    }

}
