package Homework16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyInput {
    public static String[] consInput() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String str = "";
        do {
            if(sc.hasNext()) {
                str = sc.nextLine();
                if(!str.equals("Exit")){
                    list.add(str);
                }
            }
        } while (!str.equals("Exit"));
        return list.toArray(new String[2]);
    }
}
