import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double withdraw = sc.nextDouble();
        try {
            if (withdraw > balance) throw new Exception("Insufficient balance!");
            balance -= withdraw;
            System.out.println("Remaining Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

