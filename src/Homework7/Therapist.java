package Homework7;

public class Therapist extends Doctor{

    private static String name = "Терапевт";

    public static String getName(){
        return name;
    }
    public static void treat() {
        getName();
        System.out.println("Терапевт лечит пациента");
    }


    public static String appointADoctor(int treatmentPlan){
        switch (treatmentPlan){
            case 1 :

                Surgeon.treat();
                return Surgeon.getName();

            case 2 :
                Dentist.treat();
                return Dentist.getName();


            default:

                Therapist.treat();
                return Therapist.getName();
        }
    }
}
