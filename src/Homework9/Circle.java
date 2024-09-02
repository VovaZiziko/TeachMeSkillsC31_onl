package Homework9;

public class Circle extends Figure{
    final double pi = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }
}
