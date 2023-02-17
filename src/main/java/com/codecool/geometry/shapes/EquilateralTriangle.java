package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    private final double side;

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.side = side;
    }

    @Override
    public String getAreaFormula() {
        return "√3 / 4 * side * side";
    }

    @Override
    public String getPerimeterFormula() {
        return "3 * side";
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "side=" + side +
                '}';
    }
}
