package Homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private String str;  // "OOO bkglf5 gll 98eskg DKLN jjLKU CK98LD AA fgFRkk C Ledf O 8879D RFKC VMDKEOL DKLOOC"



    public void getAbbreviations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку ");
        str = sc.nextLine();
        Pattern p = Pattern.compile("\\b([A-Z]{2,6})\\b");
        Matcher m = p.matcher(str);
        while(m.find()){;

            System.out.println(m.group());
        }
    }
}
