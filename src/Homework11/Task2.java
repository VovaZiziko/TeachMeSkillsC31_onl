package Homework11;

import java.util.Scanner;

public class Task2 {

    private String[] mass = new String[3];

    public void compareStr(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < mass.length; i++) {
            System.out.println("Введите строку ");
            mass[i] = sc.nextLine();
        }

        for(int i = 0; i < mass.length-1; i++) {
            for(int j = i+1; j < mass.length; j++){
                String tmp;
                if (mass[j].length() < mass[i].length()) {
                    tmp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = tmp;
                }
            }


        }
        for (String str : mass){
            System.out.println(str);
        }

    }
}
