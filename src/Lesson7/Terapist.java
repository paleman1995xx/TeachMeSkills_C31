package Lesson7;

public class Terapist extends Doctor{
    private Surgeon surgeon;
    private Dentist dentist;

    public Terapist (Surgeon surgeon, Dentist dentist){
        this.surgeon = surgeon;
        this.dentist = dentist;
    }

    public void setDoctor(Patient patient){
        switch (patient.getHealing()){
            case 1:
                patient.setDoctor(surgeon);
                break;
            case 2:
                patient.setDoctor(dentist);
                break;
            default:
                patient.setDoctor(this);
                break;
        }
    }

    @Override
    public String treatment() {
        return "Terapist";
    }
}
