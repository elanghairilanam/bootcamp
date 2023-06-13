package Childs;

import Parents.Shape;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        double area = 0.5 * height * base;
        return area;
    }
}
