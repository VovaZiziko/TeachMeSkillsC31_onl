package Homework9;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter();
        return sqrt(p * (p - a)*(p - b)*(p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
