package Homework9;

public class Accountant implements Printable{

    private String title = "Accountant";

    @Override
    public void print() {
        System.out.println(title);
    }
}
