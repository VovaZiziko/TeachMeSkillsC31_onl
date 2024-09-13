package Homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private String phoneNumber;
    private String documentNumber;
    private String email;
    String text; //"Lorem ipsum dolor VasyaPupkin1897@gmail.com sit amet, consectetur adipiscing elit, sed do eiusmod 1098-7654-32 tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation +(29)1234567 ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate Nagibator2000@mail.ru velit esse cillum dolore eu fugiat +(44)7876650 nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in 1234-5678-90 culpa qui officia deserunt mollit anim id est laborum."


    public void parse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст ");
        text = sc.nextLine();
        Pattern p1 = Pattern.compile("([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+)"); // email
        Pattern p2 = Pattern.compile("[+][(]\\d{2}[)]\\d{7}\\b");  // phone number
        Pattern p3 = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher m1 = p1.matcher(text);
        Matcher m2 = p2.matcher(text);
        Matcher m3 = p3.matcher(text);
        while(m1.find()){;
            System.out.println("email: " + m1.group());
        }
        while (m2.find()){
            System.out.println("phone number: " + m2.group());
        }
        while (m3.find()){
            System.out.println("document number: " + m3.group());
        }


    }
}
