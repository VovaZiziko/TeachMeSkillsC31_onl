package Homework18;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task1
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, -2, 3, 0, 5, 5, 6 , 7, 8 , 8, 9));
//        Optional<Integer> sum = list.stream().distinct().filter(x -> x%2 == 0).reduce(Integer::sum);
//        System.out.println(sum.get());





        //Task2
        Map<Integer, String> src = new HashMap<>(Map.of(1, "Peter", 2, "Adrian", 3, "Eric",
                4, "Harry", 5, "Kyle", 7, "Wendy", 8, "Elizabeth", 9, "Mary",
                13, "Sarah", 15, "Olivia"));
        Set<Integer> keys = src.keySet();
        List<Map.Entry<Integer,String>> tmp = new ArrayList<>(src.entrySet());
        List<String> l = tmp.stream().filter(x -> x.getKey() == 1 || x.getKey() == 2 || x.getKey() == 5 ||
                x.getKey() == 8 || x.getKey() == 9 ||x.getKey() == 13 )
                .filter(x -> x.getValue().length()%2 != 0)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.println(l);

        List<String> result = l.stream().map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.toList());
        System.out.println(result);
    }
}
