package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ClickImportAndLoadFile extends TestBase {


    @Test(description = "BRITE-1038")
    public void ClickImportAndLoadFile () {


        extentLogger = report.createTest("DeliveryOrder Click On Import And Load File test");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();

        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        pages.deliveryYourCompny().deliveryOrderDB.click();

        extentLogger.info("Clicking on the Import button");
        pages.deliveryYourCompny().importButton.click();


        String path = "/Users/lamenay/Downloads/TaskCase - 3.xlsx";
        //file upload happens here
        pages.deliveryYourCompny().uploadBox.sendKeys(path);


        Assert.assertTrue(Files.exists(Paths.get(path)));
        extentLogger.info("Test Completed sucessfully");



    }

}
