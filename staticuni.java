class University {

    // Static nested class
    static class Department {
        private int deptId;
        private String deptName;

        // Constructor
        Department(int deptId, String deptName) {
            this.deptId = deptId;
            this.deptName = deptName;
        }

        // Method to display department details
        void display() {
            System.out.println("Department ID: " + deptId);
            System.out.println("Department Name: " + deptName);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        // Create Department objects using the static nested class
        Department d1 = new Department(1, "Computer Science");
        Department d2 = new Department(2, "Mechanical Engineering");
        Department d3 = new Department(3, "Electrical Engineering");

        // Display department information
        d1.display();
        d2.display();
        d3.display();
    }
}

