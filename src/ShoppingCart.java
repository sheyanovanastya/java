import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(Product product) {
        cart.remove(product);
    }

    public double calculateTotal() {
        return cart.stream().mapToDouble(Product::applyDiscount).sum();
    }

    public void showCart() {
        cart.forEach(System.out::println);
        System.out.println("Загально: " + calculateTotal() + " Uah");
    }
}