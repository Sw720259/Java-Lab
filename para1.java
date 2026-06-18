class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeMain {
    static void displayEmployee(Employee e) {
        System.out.println("ID: " + e.empId + ", Name: " + e.name + ", Salary: " + e.salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(201, "Ravi", 50000);
        displayEmployee(e1);
    }
}

