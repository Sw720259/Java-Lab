class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) { super(msg); }
}

public class BankCustom {
    public static void main(String[] args) {
        double balance = 5000, withdraw = 6000;
        try {
            if (withdraw > balance) throw new InsufficientBalanceException("Not enough balance!");
            balance -= withdraw;
            System.out.println("Remaining Balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

