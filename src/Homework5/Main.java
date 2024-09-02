package Homework5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1.1
        int[][] mass = new int[6][6];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(100);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");


        //Task 1.2
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите целое число ");
        int incr = sc.nextInt();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] += incr ;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");


        //Task 1.3
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                sum += mass[i][j];
            }
        }
        System.out.println("Сумма элементов массива равна " + sum);
        System.out.println("-------------------");


        //Task2
        String[][] arr = new String[8][8];
        String white = "W";
        String black = "B";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0){
                    arr[i][j] = "W";
                    System.out.print(arr[i][j] + " ");
                }else {
                    arr[i][j] = "B";
                    System.out.print(arr[i][j] + " ");
                }

            }System.out.println();
        }
        System.out.println("-------------------");







    }
}
