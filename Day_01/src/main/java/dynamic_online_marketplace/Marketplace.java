package dynamic_online_marketplace;

public class Marketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(discountedPrice);
        System.out.println("Discount applied! New Price: " + discountedPrice);
    }
}

