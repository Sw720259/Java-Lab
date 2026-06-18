class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentMain {
    static void displayStudent(Student s) {
        System.out.println("ID: " + s.id + ", Name: " + s.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Swathi");
        displayStudent(s1);
    }
}

