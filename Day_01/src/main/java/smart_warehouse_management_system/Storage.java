package smart_warehouse_management_system;

import java.util.*;

public class Storage<T extends WarehouseItem>{
    private List <T> items=new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }


    public static void displayItems(List<? extends WarehouseItem> items) {
        System.out.println("Displaying all stored items:");
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }

    public List<? extends WarehouseItem> getItems() {
        return items;
    }
}
