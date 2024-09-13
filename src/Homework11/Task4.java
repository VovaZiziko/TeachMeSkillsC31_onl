package Homework11;

import java.util.Scanner;

public class Task4 {

    String unique = "";
    private String[] mass = new String[3];
    Scanner sc = new Scanner(System.in);

    public void init(){
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите строку ");
            mass[i] = sc.nextLine();
        }
        outerLoop :
        for (String str : mass){
            String[] words = str.split("[., ;:-]");
            middleLoop:
            for (String word : words){
                for (int i = 0; i < word.length() - 1; i++){
                    for (int j = i + 1; j < word.length(); j++) {
                        if (word.charAt(i) == word.charAt(j)) {
                            unique = "Отсутствует";
                            break middleLoop;
                        } else {
                            unique = word;
                        }
                    }
                }
                System.out.println(unique);
                break outerLoop;
            }
        }


    }





//    public void findUnique() {
//
//        String unique = "";
//        String word = "";
//
//        outerLoop:
//        for (int i = 0; i < word.length() - 1; i++){
//            for (int j = i + 1; j < word.length(); j++) {
//                if (word.charAt(i) == word.charAt(j)) {
//                    unique = "Отсутствует";
//                    break outerLoop;
//                } else {
//
//                    unique = word;
//                }
//
//            }
//
//        System.out.println(unique);
//        }
//
//    }
}
