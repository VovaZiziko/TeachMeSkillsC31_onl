package Homework15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task1.t1();


//        Task2 t2 = new Task2();
//        t2.show();
//        t2.addAnimal("Жираф"); // через передачу аргумента
//        t2.addAnimal("Тигр");
//        t2.addAnimal("Медведь");
//        t2.addAnimal("Песец");
//        t2.addAnimal("Буйвол");
//        t2.addAnimal();
//        t2.addAnimal();
//        t2.show();
//        t2.deleteAnimal();
//        t2.deleteAnimal();
//        t2.deleteAnimal();
//        t2.deleteAnimal();
//        t2.show();


        List<Student> students = new ArrayList<>();
        students.add(new Student("Вася", 1, 1, new int[] {3, 2, 2, 3}));
        students.add(new Student("Катя", 1, 2, new int[] {5, 5, 3, 4}));
        students.add(new Student("Петя", 1, 2, new int[] {4, 3, 3, 2}));
        students.add(new Student("Лена", 1, 1, new int[] {4, 3, 2, 2}));

        StudentProcessor sp = new StudentProcessor(students);
        sp.printStudents(students, 1);
        System.out.println("--------------------");
        List<Student> processedStudents = sp.process();
        sp.printStudents(processedStudents, 2);



    }


}
