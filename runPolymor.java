// Superclass
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

// Subclass: Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Subclass: Triangle
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

// Main class
public class ShapeMain {
    public static void main(String[] args) {
        // Array of superclass references
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        // Runtime polymorphism: overridden methods invoked
        for (Shape s : shapes) {
            s.draw();  // JVM decides which method to call at runtime
        }
    }
}

