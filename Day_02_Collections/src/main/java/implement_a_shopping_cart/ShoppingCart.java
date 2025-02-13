package implement_a_shopping_cart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private final Map<String, Double> productMap = new HashMap<>();
    private final Map<String, Double> orderedProductMap = new LinkedHashMap<>();
    private final TreeMap<Double, String> sortedProductMap = new TreeMap<>();

    public void addProduct(String product, double price) {
        productMap.put(product, price);
        orderedProductMap.put(product, price);
        sortedProductMap.put(price, product);
    }

    public void displayOrderedProducts() {
        System.out.println("\nProducts in Order Added:");
        orderedProductMap.forEach((product, price) -> System.out.println(product + ": " + price));
    }

    public void displaySortedProducts() {
        System.out.println("\nProducts Sorted by Price:");
        sortedProductMap.forEach((price, product) -> System.out.println(product + ": " + price));
    }

    public double getTotalCost() {
        return productMap.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public void displayCart() {
        displayOrderedProducts();
        displaySortedProducts();
        System.out.println("\nTotal Cost: " + getTotalCost());
    }
}
