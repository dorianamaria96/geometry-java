package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.utilities.StringUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class ShapeCollection {

    private final List<Shape> shapesList = new ArrayList<>();

    public void addShape(Shape shape) {
        shapesList.add(shape);
    }

    public String getShapesTable() {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/---------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n");
        stringBuilder.append("| ID|           Class            |                toString                | Perimeter |          Formula          |    Area    |                Formula               |" + "\n");
        int counterId = 0;
        for (Shape shape : shapesList) {
            stringBuilder.append("|---|----------------------------|----------------------------------------|-----------|---------------------------|------------|--------------------------------------|" + "\n");
            stringBuilder.append("|").append(StringUtil.center(String.valueOf(counterId), 3)).append("|");
            stringBuilder.append(StringUtil.center(shape.getClass().getSimpleName(), 28)).append("|");
            stringBuilder.append(StringUtil.center(shape.toString(), 40)).append("|");
            stringBuilder.append(StringUtil.center(df.format(shape.calculatePerimeter()), 11)).append("|");
            stringBuilder.append(StringUtil.center(shape.getPerimeterFormula(), 27)).append("|");
            stringBuilder.append(StringUtil.center(df.format(shape.calculateArea()), 12)).append("|");
            stringBuilder.append(StringUtil.center(shape.getAreaFormula(), 38)).append("|\n");
            stringBuilder.append("\\---------------------------------------------------------------------------------------------------------------------------------------------------------------------/" + "\n");

            counterId++;
        }
        return stringBuilder.toString();
    }

    public Shape getLargestShapeByArea() {
        double largestPerimeter = 0;
        Shape maxPerimeterShape = null;
        for (Shape shape : shapesList) {
            double currentPerimeter = shape.calculatePerimeter();
            if (currentPerimeter > largestPerimeter) {
                largestPerimeter = currentPerimeter;
                maxPerimeterShape = shape;
            }
        }
        return maxPerimeterShape;

    }

    public Shape getLargestShapeByPerimeter() {
        double largestArea = 0;
        Shape maxAreaShape = null;
        for (Shape shape : shapesList) {
            double currentArea = shape.calculateArea();
            if (currentArea > largestArea) {
                largestArea = currentArea;
                maxAreaShape = shape;
            }
        }
        return maxAreaShape;
    }
}
