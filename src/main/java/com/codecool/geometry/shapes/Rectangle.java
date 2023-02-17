package com.codecool.geometry.shapes;

public class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String getAreaFormula() {
        return "length * width";
    }

    @Override
    public String getPerimeterFormula() {
        return "(length + width) * 2";
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
