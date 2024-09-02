package Homework9;

public abstract class Figure {

    String className = this.getClass().getSimpleName();

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
