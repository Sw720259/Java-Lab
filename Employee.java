class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeMain {
    static void increaseSalary(Employee e) {
        e.salary = e.salary * 1.10; // increase by 10%
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Swathi", 50000);
        System.out.println("Before: " + emp.name + " - " + emp.salary);
        increaseSalary(emp);
        System.out.println("After: " + emp.name + " - " + emp.salary);
    }
}

