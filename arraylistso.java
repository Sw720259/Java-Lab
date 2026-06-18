import java.util.*;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Swathi","Ravi","Anita","Manisha"));
        Collections.sort(names);
        System.out.println("Sorted Names: " + names);
    }
}

