class Parent {
    final void display() {
        System.out.println("Final method in Parent");
    }
}

class Child extends Parent {
    // ❌ Error: cannot override final method
    // void display() { System.out.println("Trying to override"); }
}

