package Homework17;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void reversedInput() {
        Supplier<String> reverse = () -> {
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку");
            StringBuilder sb = new StringBuilder(sc.nextLine());
            return s = new String(sb.reverse());
        };
        System.out.println(reverse.get());
    }
}
