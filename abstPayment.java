// Abstract class
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method
    abstract void processPayment();
}

// UPI Payment
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

// Credit Card Payment
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

// Net Banking Payment
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
public class PaymentMain {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment(1500, "user@upi");
        Payment p2 = new CreditCardPayment(5000, "1234-5678-9876-5432");
        Payment p3 = new NetBankingPayment(3000, "HDFC Bank");

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}

