package Homework9;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.print();
        worker.print();
        accountant.print();

        System.out.println("----------------------");



        Figure[] mass = {
                new Circle(4),
                new Triangle(2,3,4),
                new Rectangle(6, 7),
                new Circle(3.5),
                new Rectangle(4.7, 9.3),
        };

        double sumPerimeter = 0;
        double sumArea = 0;
        for (Figure figure : mass){
            sumPerimeter += figure.calculatePerimeter();
            sumArea += figure.calculateArea();
            System.out.println("Периметр " + figure.className + "   "+ figure.calculatePerimeter());
            System.out.println("Площадь " + figure.className + "   "+ figure.calculateArea());
        }
        System.out.println("Сумма периметров 5 фигур равна = " + sumPerimeter);
        System.out.println("Сумма площадей 5 фигур равна = " + sumArea);


    }
}
