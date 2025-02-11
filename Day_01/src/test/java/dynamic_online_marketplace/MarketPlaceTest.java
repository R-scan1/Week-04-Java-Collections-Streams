package dynamic_online_marketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MarketplaceTest {

    @Test
    void testApplyDiscountBookProduct() {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Technology"));

        Marketplace.applyDiscount(book, 10);

        assertEquals(450, book.getPrice(), 0.01);
    }

    @Test
    void testApplyDiscountClothingProduct() {
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 150, new ClothingCategory("Casual"));

        Marketplace.applyDiscount(shirt, 15);

        assertEquals(127.5, shirt.getPrice(), 0.01);
    }

    @Test
    void testProductCategory() {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Technology"));
        assertEquals("Technology", book.getCategory().getGenre());

        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 150, new ClothingCategory("Casual"));
        assertEquals("Casual", shirt.getCategory().getType());
    }
}
