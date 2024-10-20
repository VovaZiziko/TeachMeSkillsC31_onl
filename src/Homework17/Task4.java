package Homework17;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Task4 {
    public static void fromBYNToUSD () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму\n");
        String str = (sc.nextLine()) + " BYN";
        System.out.print(str + " равно ");
        Consumer <String> parse = x -> {
            String[] arr = x.split(" ");
            String num = arr[0];
            System.out.printf("%.2f USD", Double.parseDouble(num)/3.31);
        };
        parse.accept(str);
    }
}
