package Homework14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class LongestWord {
    private String source; // "C:\Users\vovaz\OneDrive\Рабочий стол\Romeo and Julietta (en).txt"
    private String result; // "C:\Users\vovaz\OneDrive\Рабочий стол\Romeo and Julietta 2 (en).txt"
    private String longestW = "";
    public LongestWord(String source, String result) {
        this.source = source;
        this.result = result;
    }

    StringBuilder buffer = new StringBuilder();

    public void search() throws IOException, FileNotFoundException {
        try(FileReader reader = new FileReader(source);
            FileWriter writer = new FileWriter(result)) {
            while (reader.ready()){
                buffer.append((char) reader.read());
            }
            String[] b = buffer.toString().split("\\W");
            for(String str : b){
                if(longestW.length() < str.length()) {
                    longestW = str;
                }
            }
            writer.write(longestW);
        }
    }
}
