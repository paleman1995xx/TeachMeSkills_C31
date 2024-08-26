import Lesson7.*;

public class Main {

    public static void main(String[] args) {
        createHospital();
    }

    public static void createHospital() {
        Patient[] patients = new Patient[]{
                new Patient(1),
                new Patient(2),
                new Patient(3),
                new Patient(3),
                new Patient(2),
                new Patient(1),
                new Patient(3),
                new Patient(2),
                new Patient(1),
                new Patient(1),
        };
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Terapist terapist = new Terapist(surgeon,dentist);

        Hospital hospital = new Hospital(terapist,surgeon,dentist);

        for (Patient patient : patients) {
            hospital.getTerapist().setDoctor(patient);
        }

        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}