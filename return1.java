class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class BankAccountMain {
    static BankAccount createAccount() {
        return new BankAccount(12345, 5000.75);
    }

    public static void main(String[] args) {
        BankAccount acc = createAccount();
        System.out.println("Account No: " + acc.accountNumber + ", Balance: " + acc.balance);
    }
}

