public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 9, 20, 3, 15, 8, 2, 11};
        int sum = 0, largest = arr[0], smallest = arr[0];

        System.out.println("Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
            sum += num;
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

