
class Bank {
    private String bankName;
    private String branch;

    // Constructor for Bank
    Bank(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
    }

    // Non-static inner class
    class Account {
        private int accountNumber;
        private String holderName;
        private double balance;

        // Constructor for Account
        Account(int accountNumber, String holderName, double balance) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
        }

        // Method to display account details along with bank info
        void display() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Branch: " + branch);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + holderName);
            System.out.println("Balance: " + balance);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank("Union  Bank of India", "Tubagere ");
        Bank.Account a1 = b1.new Account(1543, "Swathi", 50000.00);
        Bank.Account a2 = b1.new Account(8722, "Vikas ", 25000.00);
        Bank.Account a3 = b1.new Account(4756, " Akshya ", 75000.00);

        a1.display();
        a2.display();
        a3.display();
    }
}

