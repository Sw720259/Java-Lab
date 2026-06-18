// Hospital.java
class Hospital {

    // Static nested class
    static class Doctor {
        private int doctorId;
        private String name;
        private String specialization;

        // Constructor
        Doctor(int doctorId, String name, String specialization) {
            this.doctorId = doctorId;
            this.name = name;
            this.specialization = specialization;
        }

        // Method to display doctor details
        void display() {
            System.out.println("Doctor ID: " + doctorId);
            System.out.println("Name: " + name);
            System.out.println("Specialization: " + specialization);
            System.out.println("All the informations  ------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create Doctor objects using the static nested class
        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor(390, "Dr. Riya", "Neurology");
        Doctor d3 = new Doctor(467, "Dr. Anya", "Orthopedics");

        // Display doctor information
        d1.display();v
        d2.display();
        d3.display();
    }
}
