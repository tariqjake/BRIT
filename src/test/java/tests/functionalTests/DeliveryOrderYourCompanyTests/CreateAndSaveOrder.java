package tests.functionalTests.DeliveryOrderYourCompanyTests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.TestBase;

import java.security.Key;

import static org.testng.Assert.fail;

public class CreateAndSaveOrder extends TestBase {

    @Test(description = "BRIT-1537")
    public void createAndSaveOrder(){
        extentLogger = report.createTest("DeliveryOrder Create and safe Order");

        extentLogger.info("Logging in to the application");
        pages.login().loginUser();


        BrowserUtilities.waitUntilVisible(pages.homePage().inventoryMenu);
        extentLogger.info("Clicking in the inventory Module");
        pages.homePage().inventoryMenu.click();


        extentLogger.info("Clicking on the DeliveryOrder Dashboard");
        BrowserUtilities.waitUntilVisible(pages.deliveryYourCompny().deliveryOrderDB);
        pages.deliveryYourCompny().deliveryOrderDB.click();


        extentLogger.info("Clicking on create button");
        pages.deliveryYourCompny().createButton.click();

        extentLogger.info("Entering the character to the source documents");
        pages.deliveryYourCompny().partnerBox.click();
        pages.deliveryYourCompny().partnerBox.sendKeys("12 th co." + Keys.ENTER);
        pages.deliveryYourCompny().sourceDocument.sendKeys("WH001 " + Keys.ENTER);

        extentLogger.info("Clicking on the save button");
        pages.deliveryYourCompny().saveButton.click();

        extentLogger.info("Navigating back to the delivery list");
        driver.navigate().back();

        extentLogger.info("Verifing if the created order is saved and exists in the delivery order list");
        Assert.assertTrue(pages.deliveryYourCompny().isExists());
        extentLogger.pass("Test completed sucessfully");





    }
}
