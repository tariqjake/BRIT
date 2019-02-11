package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeliveryYourCompanyPage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;


public class OrganizeDeliveryOrderLayout extends TestBase {

    @Test(description = "BRIT-1113")
    public void organizeDeliveryOrderLayout() {
        extentLogger = report.createTest("DeliveryOrder  organize delivery order layouts");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().deliveryOrderDB);
        pages.deliveryYourCompny().deliveryOrderDB.click();



        extentLogger.info("Clicking on the icons next to the texts to organize accordingly");
        pages.deliveryYourCompny().organizingIcons.get(1).click();

        extentLogger.info("Veryifing if the order is Organized in Asending Order");
        Assert.assertTrue(pages.deliveryYourCompny().isInOrder());
        extentLogger.pass("Test completed sucessfully");
        Driver.closeDriver();


    }



}
