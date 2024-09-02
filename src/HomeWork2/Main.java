package HomeWork2;

public class Main {
    public static void main(String[] args) {
        // Homework9.Task1
        double a;
        double b = 10;
        double c = 5;
        a = 4*(b+c-1)/2;
        System.out.println(a);
        System.out.println("---------------");


        // Task2
        int n = 34;
        System.out.println(n/10 + n%10);
        System.out.println("---------------");


        // Task3
        int n1 = 148;
        System.out.println(n1/100 + n1/10%10 + n1%10);
        System.out.println("---------------");


        // Task4
        double n2 = 22.456;
        System.out.println(n2%1 < 0.5 ? (long) n2 : (long) n2 +1);
        System.out.println("----------------");


        // Task5
        int q = 15;
        int w = 2;
        System.out.println(q + " / " + w + " = " + q/w + " и " + q%w + " в остатке");
        System.out.println("----------------");


        // Task6
        int a1 = 5;
        int b1 = 8;
        int tmp;
        tmp = a1;
        a1 = b1;
        b1 = tmp;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println("*************");

        int a2 = 9;
        int b2 = 6;
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println("---------------");



    }

}


