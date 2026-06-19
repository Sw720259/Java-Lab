class Product {
    int productId;
    String name;
    double price;
    int quantity;

    // Default constructor
    Product() {
        this(0, "Unknown", 0.0, 0); // calls full constructor
    }

    // Constructor with id and name
    Product(int productId, String name) {
        this(productId, name, 0.0, 0); // chaining
    }

    // Constructor with id, name, and price
    Product(int productId, String name, double price) {
        this(productId, name, price, 0); // chaining
    }

    // Constructor with all parameters
    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("ID: " + productId + ", Name: " + name +
                           ", Price: " + price + ", Quantity: " + quantity +
                           ", Total Cost: " + calculateTotalCost());
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product(); // default
        Product p2 = new Product(101, "Laptop"); // id + name
        Product p3 = new Product(102, "Phone", 25000); // id + name + price
        Product p4 = new Product(103, "Tablet", 15000, 3); // full details

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

