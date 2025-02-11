package smart_warehouse_management_system;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 51200.00, "Asus"));
        electronicsStorage.addItem(new Electronics("Smartphone", 30800.00, "Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples", 220, 1.0));
        groceriesStorage.addItem(new Groceries("Milk", 30, 1.0));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 500, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 1500, "Metal"));

        Storage.displayItems(electronicsStorage.getItems());
        System.out.println("------------------------------------------------------");
        Storage.displayItems(groceriesStorage.getItems());
        System.out.println("------------------------------------------------------");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
