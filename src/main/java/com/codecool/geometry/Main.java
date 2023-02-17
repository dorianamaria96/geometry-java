package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.utilities.Input;

public class Main {

    private static final String MENU = """
            1. Add new shape;
            2. List all shapes;
            3. Shape with largest perimeter;
            4. Shape with largest area;
            5. Show formulas;
            0. Exit.
            """;

    public static void main(String[] args) {

        Input input = new Input();
        ShapeCollection shapes = new ShapeCollection();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println(MENU);
            int option = input.chosenOption();

            switch (option) {
                case 1 -> {
                    System.out.println("Whats the name of the shape you would like to add?");
                    Shape shape = input.getShape();
                    if (shape != null) {
                        shapes.addShape(shape);
                        System.out.println("Your shape was added!");
                    }
                }
                case 2 -> {
                    System.out.println(shapes.getShapesTable());
                }
                case 3 -> {
                    System.out.println(shapes.getLargestShapeByPerimeter());
                }
                case 4 -> {
                    System.out.println(shapes.getLargestShapeByArea());
                }
                case 5 -> {
                    System.out.println("Choose which formula you would like to check!");
                    Shape shape = input.requestFormula();
                    if (shape != null) {
                        System.out.println("Formula for Perimeter is: " + shape.getPerimeterFormula());
                        System.out.println("Formula for Area is: " + shape.getAreaFormula());
                        System.out.println();
                    }
                }
                case 0 -> {
                    isRunning = false;
                }
            }
        }
    }

}
