package Homework7;

import java.util.Scanner;

public class Clinic {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте код плана лечения ");
        int code = sc.nextInt();
        Patient patient = new Patient(code);
        patient.getTreatment();
        //System.out.println(patient.doctor);


    }
}
