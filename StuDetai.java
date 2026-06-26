import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks (double): ");
        double marks = sc.nextDouble();

        System.out.print("Enter age (int): ");
        int age = sc.nextInt();

        System.out.println("\n--- Student Info ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Age: " + age);

        sc.close();
    }
}

