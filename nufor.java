import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}

