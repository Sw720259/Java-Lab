import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input String
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Input double
        System.out.print("Enter your marks (double): ");
        double marks = sc.nextDouble();

        // Input int
        System.out.print("Enter your age (int): ");
        int age = sc.nextInt();

        // Display values
        System.out.println("\n--- Entered Details ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Age: " + age);

        sc.close();
    }
}

