class Vehicle {
    private String brand;
    protected int speed;
    String fuelType; // default access

    // Default constructor
    Vehicle() {
        brand = "Unknown";
        speed = 0;
        fuelType = "Petrol";
    }

    // Parameterized constructor
    Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Method to set details
    public void setDetails(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", FuelType: " + fuelType);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Using default constructor
        Vehicle v1 = new Vehicle();
        v1.displayDetails();

        // Using parameterized constructor
        Vehicle v2 = new Vehicle("Honda", 120, "Diesel");
        v2.displayDetails();

        // Using setDetails method
        v1.setDetails("Toyota", 100, "Petrol");
        v1.displayDetails();
    }
}

