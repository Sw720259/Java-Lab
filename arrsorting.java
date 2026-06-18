import java.util.Arrays;

public class ArrayExample4 {
    public static void main(String[] args) {
        int[] a = {5, 2, 9};
        int[] b = {1, 7, 3};
        int[] merged = new int[a.length + b.length];

        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);

        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
    }
}

