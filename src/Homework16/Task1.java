package Homework16;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void wordMultiple() {
        Map<String, Boolean> map = new HashMap<>();
        System.out.println("Введите несколько строк для проверки их повторяемости или Exit для выхода");
        String[] src = MyInput.consInput();
        for(String s : src) {
            if(map.containsKey(s)) {
                map.put(s, true);
            } else map.put(s, false);
        }
        System.out.println(map);
    }
}
