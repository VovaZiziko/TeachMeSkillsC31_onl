package Homework7;

public class Patient {

    String doctor;
    private int treatmentPlan;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Patient() {
    }

    public String getTreatment(){
        return doctor = Therapist.appointADoctor(treatmentPlan);
    }
}

