package Homework15;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {

    Deque<String> animals = new LinkedList<>();
    public void addAnimal(String animal){
        animals.addFirst(animal);
    }

    public void deleteAnimal(){
        if(animals.peekLast() != null){
            animals.removeLast();
        }else System.out.println("Список пуст");
    }

    public void show(){
        System.out.println(animals);
    }


    public void addAnimal(){
        System.out.println("Введите название животного...");
        Scanner sc = new Scanner(System.in);
        animals.addFirst(sc.nextLine());
    }
}
