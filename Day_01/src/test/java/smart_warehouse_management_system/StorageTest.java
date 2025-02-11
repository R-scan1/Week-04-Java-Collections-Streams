package smart_warehouse_management_system;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class StorageTest {

    @Test
    public void testAddItem() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics laptop = new Electronics("Laptop", 51200.00, "Asus");

        electronicsStorage.addItem(laptop);
        List<? extends WarehouseItem> items = electronicsStorage.getItems();

        assertEquals(1, items.size());
        assertEquals("Laptop", items.get(0).getName());
    }


    @Test
    public void testWildcardDisplayItems() {
        Storage<Groceries> groceriesStorage = new Storage<>();
        Groceries apples = new Groceries("Apples", 220, 1.0);
        groceriesStorage.addItem(apples);

    }


}
