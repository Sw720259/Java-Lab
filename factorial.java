public class Factorial {
    public static void main(String[] args) {
        int num = 5;   // you can change this value
        int fact = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        // Display result
        System.out.println("Factorial of " + num + " = " + fact);
    }
}

