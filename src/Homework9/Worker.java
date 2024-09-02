package Homework9;

public class Worker implements Printable{

    private String title = "Worker";

    @Override
    public void print() {
        System.out.println(title);

    }
}
