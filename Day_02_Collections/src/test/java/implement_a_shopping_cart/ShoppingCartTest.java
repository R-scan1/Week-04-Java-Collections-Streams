package implement_a_shopping_cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        cart.addProduct("Laptop", 120000.00);
        cart.addProduct("Headphones", 1500.00);
        cart.addProduct("Mouse", 500.00);
        cart.addProduct("Keyboard", 1000.00);
    }

    @Test
    void testTotalCost() {
        double expectedTotal = 120000.00 + 1500.00 + 500.00 + 1000.00;
        assertEquals(expectedTotal, cart.getTotalCost(), "Total cost should match sum of product prices.");
    }

    @Test
    void testOrderedProducts() {
        cart.displayOrderedProducts();
    }

    @Test
    void testSortedProducts() {
        cart.displaySortedProducts();
    }
}
