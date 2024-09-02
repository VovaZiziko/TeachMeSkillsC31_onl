package Homework7;

public class Surgeon extends Doctor{

    private static String name = "Хирург";

    public static String getName() {
        return name;
    }

    public static void treat() {
        getName();
        System.out.println("Хирург оперирует пациента");
    }
}
