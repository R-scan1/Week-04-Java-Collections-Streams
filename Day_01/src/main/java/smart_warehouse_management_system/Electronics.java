package smart_warehouse_management_system;

public class Electronics extends WarehouseItem{
    private String brand;

    public Electronics(String name, double price,String brand) {
        super(name, price);
        this.brand=brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + getName() + " | Price: " + getPrice() + " | Brand: " + brand);
    }
}
