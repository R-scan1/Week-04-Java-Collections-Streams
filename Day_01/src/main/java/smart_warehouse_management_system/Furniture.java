package smart_warehouse_management_system;

public class Furniture extends WarehouseItem{
    String built;
    public Furniture(String name, double price,String built) {
        super(name, price);
        this.built=built;
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture: " + getName() + " | Price: " + getPrice() + " | Built: " + built);
    }
}
