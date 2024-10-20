package Homework17;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Task2 {
    public static void selectPositive() {
        List<Double> list = new ArrayList<>();
        Double[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел и любое не-число для выхода");
        while (sc.hasNext()) {
            if(sc.hasNextDouble()) {
                list.add(sc.nextDouble());
            }else break;
        }
        array = list.toArray(new Double[0]);
        Predicate<Double> isPositive = x -> x > 0;
        for(Double d : array) {
            if(isPositive.test(d)) {
                System.out.print(d + " ");
            }
        }
        System.out.println();

    }
}
