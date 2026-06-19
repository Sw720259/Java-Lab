// Superclass
class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Method to be overridden
    void work() {
        System.out.println("Employee " + name + " is working.");
    }
}

// Subclass: Manager
class Manager extends Employee {
    Manager(int empId, String name) {
        super(empId, name);
    }

    @Override
    void work() {
        System.out.println("Manager " + name + " is managing the team.");
    }
}

// Subclass: Developer
class Developer extends Employee {
    Developer(int empId, String name) {
        super(empId, name);
    }

    @Override
    void work() {
        System.out.println("Developer " + name + " is writing code.");
    }
}

// Subclass: Tester
class Tester extends Employee {
    Tester(int empId, String name) {
        super(empId, name);
    }

    @Override
    void work() {
        System.out.println("Tester " + name + " is testing the application.");
    }
}

// Main class
public class EmployeeMain {
    public static void main(String[] args) {
        // Array of superclass references
        Employee[] employees = new Employee[3];

        employees[0] = new Manager(101, "Harshitha");
        employees[1] = new Developer(102, "Swathi");
        employees[2] = new Tester(103, "Brunda");

        // Runtime polymorphism: overridden methods invoked
        for (Employee e : employees) {
            e.work();
        }
    }
}
i
