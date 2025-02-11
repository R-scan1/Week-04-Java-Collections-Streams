package dynamic_online_marketplace;

public class Main {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 5000, new BookCategory("Technology"));

        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1500, new ClothingCategory("Casual"));

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 15);
    }
}

