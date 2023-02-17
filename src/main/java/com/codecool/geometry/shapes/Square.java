package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    private final double side;


    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String getAreaFormula() {
        return "side * side";
    }

    @Override
    public String getPerimeterFormula() {
        return "4 * side";
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

