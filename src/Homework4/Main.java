package Homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создание массива и заполнение с помощью Math.random()
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер массива (целое положительное число) ");
//        int size = sc.nextInt();
//        int[] mass = new int[size];
//        for (int i = 0; i < size; i++){
//            mass[i] = (int )(Math.random() * 10);
//        }


        // Создание и заполнение массива вручную
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива (целое положительное число) ");
        int size = sc.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Введите значение для индекса " + i);
            mass[i] = sc.nextInt();
        }
        System.out.println("-------------------------");


        //Homework9.Task1
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        for (int i = mass.length - 1; i >=0; i--){
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------");


        //Task2
        int max = mass[0];
        int min = mass[0];
        for (int i = 1; i < mass.length; i++){
            if (mass[i] > max){
                max = mass[i];
            }
            if (mass[i] < min){
                min = mass[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("--------------------------");


        //Task3
        int max1 = mass[0];
        int min1 = mass[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < mass.length; i++){
            if (mass[i] > max1){
                max1 = mass[i];
                maxIndex = i;
            }
            if (mass[i] < min1){
                min1 = mass[i];
                minIndex = i;
            }
        }
        System.out.println("Индекс максимальнго значения: " + maxIndex);
        System.out.println("Индекс минимального значения: " + minIndex);
        System.out.println("--------------------------");


        //Task4
        int zeroCounter = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] == 0){
               zeroCounter++;
            }
        }
        if (zeroCounter == 0){
            System.out.println("Нулевых элементов нет");
        }else {
            System.out.println("В массиве " + zeroCounter +" нулевых элементов");
        }
        System.out.println("-------------------------");


        //Task5
        for (int i = 0; i < mass.length/2; i++ ){
            int tmp = mass[mass.length-1-i];
            mass[mass.length-1-i] = mass[i];
            mass[i] = tmp;
            }
        for (int i : mass){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------");


        //Task6
        boolean flag = true;
        for(int i = 1; i < mass.length-1; i++){
            if (mass[i] < mass[i-1]) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив является возрастающей последовательностью");
        }else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
        System.out.println("---------------------");

    }


}

