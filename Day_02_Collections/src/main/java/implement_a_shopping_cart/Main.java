package implement_a_shopping_cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 120000.00);
        cart.addProduct("Headphones", 1500.00);
        cart.addProduct("Mouse", 500.00);
        cart.addProduct("Keyboard", 1000.00);

        cart.displayCart();
    }
}
