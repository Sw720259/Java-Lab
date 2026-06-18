class Mobile {
    String brand;
    double price;

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}

public class MobileMain {
    static void applyDiscount(Mobile m, double discountPercent) {
        m.price = m.price - (m.price * discountPercent / 100);
    }

    public static void main(String[] args) {
        Mobile mob = new Mobile("Samsung", 20000);
        System.out.println("Before Discount: " + mob.brand + " - " + mob.price);
        applyDiscount(mob, 10);
        System.out.println("After Discount: " + mob.brand + " - " + mob.price);
    }
}

