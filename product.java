class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductMain {
    static Product createProduct() {
        return new Product("Laptop", 65000);
    }

    public static void main(String[] args) {
        Product p = createProduct();
        System.out.println("Product: " + p.name + ", Price: " + p.price);
    }
}

