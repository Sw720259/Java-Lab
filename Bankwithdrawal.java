import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient balance!");
            }
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

