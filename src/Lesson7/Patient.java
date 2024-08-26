package Lesson7;

public class Patient {
    private int healing;
    private Doctor doctor;

    public Patient(int healing) {
        this.healing = healing;
    }

    @Override
    public String toString() {
        return "Treatment plan " + this.healing + "\n treatment doctor " + this.doctor.treatment();
    }

    public int getHealing() {
        return healing;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}