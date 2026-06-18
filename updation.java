class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentUpdateMain {
    static void updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Anusha", 70);
        System.out.println("Before Update: " + s1.name + " - " + s1.marks);

        updateMarks(s1, 85);
        System.out.println("After Update: " + s1.name + " - " + s1.marks);
    }
}
i

