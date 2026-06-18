class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PersonMain {
    static Person updatePerson(Person p) {
        p.age += 1; // increment age
        return p;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Swathi", 20);
        System.out.println("Before Update: " + p1.name + " - " + p1.age);
        Person updated = updatePerson(p1);
        System.out.println("After Update: " + updated.name + " - " + updated.age);
    }
}

