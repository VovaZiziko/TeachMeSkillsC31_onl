package Homework11;

import java.util.Scanner;

public class Task1 {

    private String[] mass = new String[3];

    public void compareStr(){
        String max;
        String min;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < mass.length; i++) {
            System.out.println("Введите строку ");
            mass[i] = sc.nextLine();
        }
        max = mass[0].length() > mass[1].length()? mass[0] : mass[1];
        max = max.length() > mass[2].length() ? max : mass[2];
        System.out.println("Самая длинная строка: " + max + ". Ее длина: " + max.length());

        min = mass[0].length() < mass[1].length()? mass[0] : mass[1];
        min = min.length() < mass[2].length() ? min : mass[2];
        System.out.println("Самая короткая строка: " + min + ". Ее длина: " + min.length());

    }

}


