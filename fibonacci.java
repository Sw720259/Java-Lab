public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;  // number of terms to print
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Print first two terms
        System.out.print(first + " " + second);

        // Loop to generate remaining terms
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);

            // Update values
            first = second;
            second = next;
        }
    }
}

