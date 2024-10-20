package Homework17;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {

     public static void computeDate() {
        String dateOfBirth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате год-месяц-день    ");
        if (sc.hasNext()) {
        dateOfBirth =sc.nextLine();
        LocalDate ld = LocalDate.parse(dateOfBirth);
        System.out.println("Вам исполнится 100 лет " + ld.plusYears(100));
        }
    }
}
