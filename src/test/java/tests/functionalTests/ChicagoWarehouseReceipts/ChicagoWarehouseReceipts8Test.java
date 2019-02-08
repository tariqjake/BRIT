package tests.functionalTests.ChicagoWarehouseReceipts;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.TestBase;

public class ChicagoWarehouseReceipts8Test extends TestBase {

    public void commonSteps(ExtentTest extentLogger) {
        extentLogger.info("Logging in as a User");
        pages.login().loginUser();
        if(BrowserUtilities.isClickable(pages.homePage().inventoryMenu)) {
            extentLogger.info("Clicking on Inventory from the Menu");
            pages.homePage().inventoryMenu.click();
        }
    }

        //BRITE-2124 - "Create a partner, validate and verify it's displayed on 'Inventory / Chicago Warehouse: Receipts' page"
    @Test
    public void Brite_2124(){
        extentLogger = report.createTest("Testing if Receipt \"PO4567\" can be edited with invalid client info (phone number)");
        commonSteps(extentLogger);


    }


}
