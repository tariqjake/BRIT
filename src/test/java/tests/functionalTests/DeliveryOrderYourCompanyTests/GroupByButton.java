package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

public class GroupByButton extends TestBase {


    @Test(description = "BRIT - 1091")
    public void groupBy() {
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

        extentLogger.info("Cliking on the Group by button");
        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().groupBy);
        pages.deliveryYourCompny().groupBy.click();

        extentLogger.info("Clicking on the Group By randomly");
        String fiterDropdown = pages.deliveryYourCompny().randomGroupBy(driver);

        extentLogger.info("Getting the message after randomly selecting from the dropDown");
        String messageFromDropDown2 = pages.deliveryYourCompny().messages.getAttribute("innerText");

        extentLogger.info("Verifying is the selected item messages with the selected item");
        Assert.assertEquals(fiterDropdown, messageFromDropDown2);
        extentLogger.pass("Test completed sucessfully");
        Driver.closeDriver();



    }


}
