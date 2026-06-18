class Patient {
    String name;
    String diagnosis;

    Patient(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }
}

class Hospital {
    static void updateDiagnosis(Patient p, String newDiagnosis) {
        p.diagnosis = newDiagnosis;
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        Patient p1 = new Patient("Swathi", "Fever");
        System.out.println("Before: " + p1.name + " - " + p1.diagnosis);
        Hospital.updateDiagnosis(p1, "Recovered");
        System.out.println("After: " + p1.name + " - " + p1.diagnosis);
    }
}

