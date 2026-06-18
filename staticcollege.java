
class College {
    private String collegeName;
    private String location;

    // Constructor for College
    College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    // Non-static inner class
    class Student {
        private int rollNo;
        private String name;
        private String course;

        // Constructor for Student
        Student(int rollNo, String name, String course) {
            this.rollNo = rollNo;
            this.name = name;
            this.course = course;
        }

        // Method to display student details along with college info
        void display() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Location: " + location);
            System.out.println("Student Roll No: " + rollNo);
            System.out.println("Student Name: " + name);
            System.out.println("Course: " + course);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        // Create College object
        College c1 = new College("AMITY UNIVERSITY ", "Bangalore");

        // Create Student objects using the inner class
        College.Student s1 = c1.new Student(101, "Swathi", "Electronics and Communication Engineering");
        College.Student s2 = c1.new Student(102, "Kavya ", "Computer Science ");
        College.Student s3 = c1.new Student(103, "Priya", "Electrical Engineering");

        // Display student details along with college info
        s1.display();
        s2.display();
        s3.display();
    }
}

