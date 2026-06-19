public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }

            int[] arr = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid index");
        }
    }
}

