public class OddNumbers {
    public static void main(String[] args) {
        // Define range
        int start = 1;
        int end = 20;

        System.out.println("Odd numbers between " + start + " and " + end + ":");

        // Loop to print odd numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {   // condition for odd numbers
                System.out.println(i);
            }
        }
    }
}

