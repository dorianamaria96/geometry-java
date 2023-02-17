package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {

    private final double side;

    public RegularPentagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {

        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * this.side;
    }

    @Override
    public String getAreaFormula() {
        return "0.25 * √(5 * (5 + 2 * √5)) * side * side";
    }

    @Override
    public String getPerimeterFormula() {
        return "5 * side";
    }

    @Override
    public String toString() {
        return "RegularPentagon{" +
                "side=" + side +
                '}';
    }
}
