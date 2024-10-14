package Homework16;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void pairs(String[] src) {
        Map<String,String> map = new HashMap<>();
        for(String s : src) {
            String[] letters = s.split("");
            map.put(letters[0], letters[letters.length-1]);
        }
        System.out.println(map);
    }
}
