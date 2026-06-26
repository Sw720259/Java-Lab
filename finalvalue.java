final class Constants {
    // final variable (constant value)
    final int VALUE = 100;

    // final method
    final void displayValue() {
        System.out.println("Final VALUE = " + VALUE);
    }
}

// Subclass attempt (will cause error if uncommented because Constants is final)
// class ExtendedConstants extends Constants { }  // ❌ Not allowed

public class FinalDemo {
    public static void main(String[] args) {
        Constants obj = new Constants();

        // Access final variable
        obj.displayValue();

        // Trying to change VALUE will cause a compile-time error
        // obj.VALUE = 200;  // ❌ Not allowed
    }
}

