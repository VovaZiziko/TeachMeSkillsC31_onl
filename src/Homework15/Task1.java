package Homework15;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void t1() {
        System.out.println("Введите несколько целых чисел через запятую");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        Set<String> numbers = new HashSet<>();
        while (m.find()){
            numbers.add(m.group());
        }
        System.out.println(numbers);



    }
}