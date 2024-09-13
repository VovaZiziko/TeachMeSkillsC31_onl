package Homework11;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Palindrome {
    private String text;
    private int wordNumber;
    private String word;
    private String reversedWord = "";


    public void isPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку...");
        text = sc.nextLine();
        String[] mass = text.split(" ");
        while(true){
            System.out.println("Введите номер слова от 1 до " + mass.length);
            int tmp = sc.nextInt();
            if(tmp > 0 && tmp <= mass.length){
                wordNumber = tmp;
                break;
            }
        }

        word = mass[wordNumber - 1];
        for(int i = word.length() - 1; i >= 0 ; i--){
            reversedWord += word.charAt(i);
        }
        System.out.println(word.equals(reversedWord));
        System.out.println(word);
        System.out.println(reversedWord);

    }
}
