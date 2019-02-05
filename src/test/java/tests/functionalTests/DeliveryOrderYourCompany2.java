package tests.functionalTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;

import utilities.Driver;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.fail;


public class DeliveryOrderYourCompany2 extends TestBase {


    @Test(description = "BRITE-1038")
    public void DeliveryOrderYourCompany2() {


        extentLogger = report.createTest("DeliveryOrder Click On Import And Load File test");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.wait(3);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.wait(3);
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on the Import button");
        BrowserUtilities.wait(3);
        pages.deliveryYourCompny().importButton.click();


        String path = "/Users/lamenay/Downloads/TaskCase - 3.xlsx";
        //file upload happens here
        pages.deliveryYourCompny().uploadBox.sendKeys(path);


        Assert.assertTrue(Files.exists(Paths.get(path)));
        extentLogger.info("Test Completed sucessfully");
        Driver.closeDriver();


    }

    @Test(description = "BRITE-1054")

    public void shouldNotDelete() {
        extentLogger = report.createTest("DeliveryOrder Click On  any order and delete");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.wait(3);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.wait(3);
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on the Check boxes");
        BrowserUtilities.wait(3);
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
        extentLogger.info("Test completed sucessfully");
        Driver.closeDriver();

    }


    @Test(description = "BRIT-1075")

    public void filter() {

        extentLogger = report.createTest("DeliveryOrder Filtring Order accordingly from drop down ");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.wait(3);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.wait(3);
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
//

    }


    @Test(description = "BRIT - 1091")
    public void groupBy() {
        extentLogger = report.createTest("DeliveryOrder Filtring Order accordingly from drop down ");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.wait(3);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.wait(3);
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on the glasssearch with thre plus sign in it");
        pages.deliveryYourCompny().glassSearch.click();

        extentLogger.info("Cliking on the Group by button");
        BrowserUtilities.wait(3);
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

    @Test(description = "BRIT=1100")
    public void totalNumber() {
        extentLogger = report.createTest("DeliveryOrder total number of order displayed");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.wait(3);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.wait(3);
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Check if the Total number of order is displyed");
        pages.deliveryYourCompny().totalnumberDisplyed.isDisplayed();

        extentLogger.info("Clicking on the sign > to see the pervious numbers");
        pages.deliveryYourCompny().previousNumber.click();

        extentLogger.info("Verifying if it is clicable and able to see pervious number");
        Assert.assertTrue(BrowserUtilities.isClickable(pages.deliveryYourCompny().previousNumber));
        fail();
        extentLogger.pass("Failed: < not clickable");


        extentLogger.info("veryfying if the < sign is clickable to see the next number");
        pages.deliveryYourCompny().nextNumber.click();
        Assert.assertTrue(BrowserUtilities.isClickable(pages.deliveryYourCompny().nextNumber));
        fail();
        extentLogger.pass("Failed: > not clickable");
        Driver.closeDriver();


    }
    @Test(description = "BRIT-1113")
    public void  organizeDeliveryOrderLayout(){
        extentLogger = report.createTest("DeliveryOrder  organize delivery order layouts");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.wait(3);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.wait(3);
        pages.deliveryYourCompny().deliveryOrderDB.click();


    }

}
