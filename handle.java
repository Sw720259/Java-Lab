import java.util.Scanner;

public class ArrayDivision {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int divisor = sc.nextInt();
        try {
            int result = arr[index] / divisor;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }
}

