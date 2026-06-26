class Demo {
    final int VALUE = 100;

    void show() {
        System.out.println("Final VALUE = " + VALUE);
        // VALUE = 200; ❌ Error: cannot assign a value to final variable
    }
}

