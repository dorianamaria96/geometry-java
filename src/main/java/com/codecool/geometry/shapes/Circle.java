package com.codecool.geometry.shapes;

public class Circle extends Shape {

    private final double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * PI * this.radius;
    }

    @Override
    public String getAreaFormula() {
        return "π * radius * radius";
    }

    @Override
    public String getPerimeterFormula() {
        return "2 * π * radius";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
