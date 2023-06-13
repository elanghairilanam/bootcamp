package Childs;

import Parents.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
