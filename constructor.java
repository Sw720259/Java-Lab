class Employee {
    int empId;
    String name;
    double salary;

    // Default constructor
    Employee() {
        this(0, "Unknown", 0.0); // calls parameterized constructor
    }

    // Constructor with id only
    Employee(int empId) {
        this(empId, "Unknown", 0.0); // chaining
    }

    // Constructor with id and name
    Employee(int empId, String name) {
        this(empId, name, 0.0); // chaining
    }

    // Constructor with all parameters
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // default
        Employee e2 = new Employee(101); // id only
        Employee e3 = new Employee(102, "Riya"); // id + name
        Employee e4 = new Employee(103, "Akshya", 67000); // full details

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}

