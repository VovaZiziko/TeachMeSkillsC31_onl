package Homework14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //LongestWord lw = new LongestWord("C:\\Users\\vovaz\\OneDrive\\Рабочий стол\\Romeo and Julietta (en).txt",
                    //"C:\\Users\\vovaz\\OneDrive\\Рабочий стол\\Romeo and Julietta 2 (en).txt"   );
        //lw.search();




        Validator v = new Validator("C:\\Users\\vovaz\\OneDrive\\Рабочий стол\\validdocs.txt",
        "C:\\Users\\vovaz\\OneDrive\\Рабочий стол\\errdocs.txt");
        v.validate();

    }
}
