package smart_warehouse_management_system;

public class Groceries extends WarehouseItem{
    private double weight;
    public Groceries(String name, double price,double weight) {
        super(name, price);
        this.weight=weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries: " + getName() + " | Price: " + getPrice() + " | Weight: " + weight + "kg");
    }
}
