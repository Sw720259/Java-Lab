class Car {
    String model;
    double price;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

public class CarMain {
    static Car createCar() {
        return new Car("Tesla Model 3", 35000);
    }

    public static void main(String[] args) {
        Car c = createCar();
        System.out.println("Model: " + c.model + ", Price: " + c.price);
    }
}

