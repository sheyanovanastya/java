public class Product {
    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double applyDiscount() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - " + applyDiscount() + " Uah";
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price, "Electronics");
    }

    @Override
    public double applyDiscount() {
        return price * 0.9;
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price, "Clothing");
    }

    @Override
    public double applyDiscount() {
        return price * 0.85;
    }
}