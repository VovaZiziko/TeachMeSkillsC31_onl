package Homework17;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {

    public static void fromBYNToUSD () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму\n");
        String str = (sc.nextLine()) + " BYN";
        System.out.print(str + " равно ");
        Function <String, Double> parse = x -> {
            String[] arr = x.split(" ");
            String num = arr[0];
            return Double.parseDouble(num);
        };
        System.out.printf("%.2f USD",(parse.apply(str))/3.31);
    }
}
