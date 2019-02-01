package tests.smokeTests;

import org.testng.annotations.Test;
import pages.InventoryChicagoWarehouseReceiptsPage;

public class ChicagoWarehouseReceipts {
    InventoryChicagoWarehouseReceiptsPage receipts = new InventoryChicagoWarehouseReceiptsPage();

    @Test
    public void CWHReceipts(){
        receipts.ChicagoWHReceipts.switchTo();

    }
}
