// Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child) Dog inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass (Child) Cat inherits Animal
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create Dog object
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog-specific method

        // Create Cat object
        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // Cat-specific method
    }
}

