class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing...");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is coding...");
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        e1.work();
        e2.work();
    }
}

