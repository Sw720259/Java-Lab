import java.util.Scanner;

public class MarksValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try {
            if (marks < 0 || marks > 100) throw new Exception("Invalid marks!");
            System.out.println("Valid Marks: " + marks);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

