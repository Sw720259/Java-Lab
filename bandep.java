class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class BankAccountMain {
    static void deposit(BankAccount acc, double amount) {
        acc.balance += amount;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(12345, 2000);
        System.out.println("Before Deposit: Balance = " + acc.balance);
        deposit(acc, 500);
        System.out.println("After Deposit: Balance = " + acc.balance);
    }
}

