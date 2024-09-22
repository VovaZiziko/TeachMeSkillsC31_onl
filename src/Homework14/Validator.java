package Homework14;

import java.io.*;
import java.util.Scanner;

public class Validator {
    final String validDoc;
    final String errDoc;

    public Validator(String validDoc, String errDoc) {
        this.validDoc = validDoc;
        this.errDoc = errDoc;
    }

    public void validate() throws IOException, FileNotFoundException {
        System.out.println("Введите путь к файлу...");
        Scanner sc = new Scanner(System.in);
        String sourse = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(sourse));
             FileWriter fw = new FileWriter(validDoc);
             FileWriter fwer = new FileWriter(errDoc)){
            while (br.ready()){
                String tmp = br.readLine();
                if(tmp.length() != 15){
                    fwer.write(tmp + "   длина не равна 15\n");
                }else if (!(tmp.startsWith("docnum") | tmp.startsWith("contract"))) {
                    fwer.write(tmp + "   не начинается с docnum или contract\n");
                }else fw.write(tmp + "\n");
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
