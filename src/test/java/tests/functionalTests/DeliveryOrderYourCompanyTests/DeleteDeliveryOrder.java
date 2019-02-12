package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

public class DeleteDeliveryOrder extends TestBase {

    @Test(description = "BRITE-1054")

    public void shouldNotDelete() {
        extentLogger = report.createTest("DeliveryOrder Click On  any order and delete");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().deliveryOrderDB);
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on the Check boxes");
        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().checkbox);
        pages.deliveryYourCompny().checkbox.click();


        extentLogger.info("Clicking on Acton dropdown list ");
        pages.deliveryYourCompny().actiondropdown.click();

        extentLogger.info("Deleting the selected DeliveryOrder");
        pages.deliveryYourCompny().delete.click();

        extentLogger.info("Clicking On the confirmation pop up (ok) button");
        pages.deliveryYourCompny().clickingConfrmationOK.click();


        extentLogger.info("Verifying Access error message pops up after trying to delete delivery order");
        BrowserUtilities.wait(3);
        Assert.assertEquals(pages.deliveryYourCompny().accesErrorMessage.getAttribute("innerText"), " - Warning");
        extentLogger.pass("Test completed sucessfully");

    }


}
