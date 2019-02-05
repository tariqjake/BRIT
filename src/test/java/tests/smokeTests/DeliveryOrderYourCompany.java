package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class DeliveryOrderYourCompany  extends TestBase {




    @Test (description = "BRIT-1031")
    public void deliverydashboardTest()  {

        extentLogger = report.createTest("Brite delivery dashboard test");
        extentLogger.info("Logging in to the application");

        pages.login().loginUser();
        BrowserUtilities.wait(3);

        extentLogger.info("Clicking inventory module ");
        pages.homePage().inventoryMenu.click();
        String menuTitle = driver.getTitle();

        extentLogger.info("Clicking on the delivery DashBoard");
        pages.deliveryYourCompny().deliveryOrderDB.click();

        Assert.assertNotEquals(driver.getTitle(), menuTitle);
        extentLogger.pass("Test completed succesfully");
    }


    @Test(description = "BRIT-1036")
    public void  createButonTest() {

        extentLogger = report.createTest("Brite delivery Click on CreateButton");
        extentLogger.info("Logging in to the application");

        pages.login().loginUser();
        BrowserUtilities.wait(3);

        extentLogger.info("Clicking inventory module ");
        pages.homePage().inventoryMenu.click();

        extentLogger.info("Clicking on the delivery DashBoard");
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking the create button");
        pages.deliveryYourCompny().createButton.click();
        extentLogger.info("It is clickable");

        Assert.assertTrue(BrowserUtilities.isClickable(pages.deliveryYourCompny().createButton));
        extentLogger.pass("Test completed succesfully");

    }





}
