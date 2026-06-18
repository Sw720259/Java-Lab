class Mobile {
    String brand;
    String model;
    double price;

    // Constructor with all parameters
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Constructor with brand and model only (default price)
    Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 10000; // default price
    }

    void displayMobile() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

public class MobileMain {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", "iPhone 15", 99999);
        Mobile m2 = new Mobile("Samsung", "Galaxy S24");

        m1.displayMobile();
        m2.displayMobile();
    }
}

