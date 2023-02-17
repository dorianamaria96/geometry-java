package com.codecool.geometry.shapes;

public class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double base;

    public Triangle(double sideA, double sideB, double base) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = (sideA + sideB + base) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - base));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + base;
    }

    @Override
    public String getAreaFormula() {
        return "√p * (p - sideA) * (p - sideB) * (p - base))";
    }

    @Override
    public String getPerimeterFormula() {
        return "sideA + sideB + base";
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", base=" + base +
                '}';
    }
}
