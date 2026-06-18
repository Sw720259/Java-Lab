class Store {

    // Static nested class
    static class Product {
        private int id;
        private String name;
        private double price;

        // Constructor
        Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        // Method to display product details
        void display() {
            System.out.println("Product ID: " + id);
            System.out.println("Product Name: " + name);
            System.out.println("Product Price: $" + price);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        // Create Product objects using the static nested class
        Product p1 = new Product(101, "Laptop", 55000.00);
        Product p2 = new Product(102, "Smartphone", 25000.00);
        Product p3 = new Product(103, "Headphones", 1500.00);

        // Display product information
        p1.display();
        p2.display();
        p3.display();
    }
}

