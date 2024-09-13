package Homework11;

import java.util.Scanner;

public class Task3 {
    private String[] mass = new String[3];;

    public void compareStr() {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите строку ");
            mass[i] = sc.nextLine();
            sum += mass[i].length();
        }
        for (String str : mass){
            if (str.length() < sum/mass.length){
                System.out.println(str + "\n" + "Длина строки: " + str.length() + "\n");
            }

        }
    }
}
