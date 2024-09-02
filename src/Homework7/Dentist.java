package Homework7;

public class Dentist extends Doctor{

    private static String name = "Дантист";

    public static String getName(){
        return name;
    }

    public static void treat() {
        getName();
        System.out.println("Дантист лечит зубы пациенту");

    }
}
