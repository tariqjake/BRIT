package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

public class FilterButton  extends TestBase {
    @Test(description = "BRIT-1075")

    public void filter() {

        extentLogger = report.createTest("DeliveryOrder Filtring Order accordingly from drop down ");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().deliveryOrderDB);
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on the glasssearch with thre plus sign in it");
        pages.deliveryYourCompny().glassSearch.click();


        extentLogger.info("Clicking on the filter dropdown");
        pages.deliveryYourCompny().filter.click();

        extentLogger.info("Clicking On the dropdown filter randomly");
        String fiterDropdown = pages.deliveryYourCompny().randomFilter(driver);

        extentLogger.info("Getting the message  pops up after selcting dropDown from the filter");
        String messageafterselecting = pages.deliveryYourCompny().messages.getAttribute("innerText");

        extentLogger.info("Verifing if the message and the selected item matches");
        Assert.assertEquals(fiterDropdown, messageafterselecting);
        extentLogger.pass("Test completed Sucessfully");
        Driver.closeDriver();


    }
}
