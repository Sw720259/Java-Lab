// Superclass
class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Method to be overridden
    void processPayment() {
        System.out.println("Processing generic payment of Rs." + amount);
    }
}

// Subclass: UPI Payment
class UpiPayment extends Payment {
    String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI payment of Rs." + amount + " via UPI ID: " + upiId);
    }
}

// Subclass: Credit Card Payment
class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card payment of Rs." + amount + " using Card: " + cardNumber);
    }
}

// Subclass: Net Banking Payment
class NetBankingPayment extends Payment {
    String bankName;

    NetBankingPayment(double amount, String bankName) {
        super(amount);
        this.bankName = bankName;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Net Banking payment of Rs." + amount + " through Bank: " + bankName);
    }
}

// Main class
public class PaymentGateway {
    public static void main(String[] args) {
        // Array of superclass references
        Payment[] payments = new Payment[3];

        payments[0] = new UpiPayment(1500, "user@upi");
        payments[1] = new CreditCardPayment(5000, "1234-5678-9876-5432");
        payments[2] = new NetBankingPayment(3000, "HDFC Bank");

        // Runtime polymorphism: overridden methods invoked
        for (Payment p : payments) {
            p.processPayment();  // JVM decides which method to call at runtime
        }
    }
}

