package HomeWork3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Homework9.Task1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("Введенное вами число четное");
        }else {
            System.out.println("Введенное вами число нечетное");
        }
        System.out.println("--------------------");


        //Task2 с избыточной проверкой
        System.out.println("Введите значение уличной температуры ");
        int b = sc.nextInt();
        if (b > -5){
            System.out.println("Warm");
        }else if (b <= -5 && b > -20){
            System.out.println("Normal");
        } else if (b <= -20) {
            System.out.println("Cold");

        }
        System.out.println("-------------------");


        //Task3
        for(int i = 10; i <21; i++){
            System.out.println("квадрат числа " + i + " равен " + i*i);
        }
        System.out.println("---------------------");


        //Task4
        int start = 7;
        int step = 7;
        while (start <=98){
            System.out.print(start + " ");
            start += step;
            }
        System.out.println();
        System.out.println("-------------------");


        //Task* если считать вместе с заданным числом
        System.out.println("Введите любое целое положительное число");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= x; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1 до " + x + " включительно равна " + sum);
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }








    }
}
