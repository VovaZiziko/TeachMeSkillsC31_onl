package Homework11;

import java.util.Scanner;

public class Task5 {



    public void duplicateChar(){
        String result = "";
        System.out.println("Введите строку...");
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        for (int i = 0; i < source.length(); i++){
            result = result + source.charAt(i)+ source.charAt(i);
        }

        System.out.println(result);

    }

}
