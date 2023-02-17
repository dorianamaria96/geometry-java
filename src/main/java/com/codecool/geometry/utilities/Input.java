package com.codecool.geometry.utilities;

import com.codecool.geometry.shapes.*;

import java.util.Scanner;

public class Input {

    private final static String SHAPES = """
            1. Circle;
            2. Triangle;
            3. Equilateral Triangle;
            4. Rectangle;
            5. Square;
            6. Pentagon;
            """;

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public Shape getShape() {
        System.out.println(SHAPES);
        int chosenShape = scanner.nextInt();
        switch (chosenShape) {
            case 1 -> {
                System.out.println("Enter radius:");
                double radius = scanner.nextDouble();
                return new Circle(radius);
            }
            case 2 -> {
                System.out.println("Enter side A:");
                double sideA = scanner.nextDouble();
                System.out.println("Enter side B:");
                double sideB = scanner.nextDouble();
                System.out.println("Enter base:");
                double base = scanner.nextDouble();
                return new Triangle(sideA, sideB, base);
            }
            case 3 -> {
                System.out.println("Enter side:");
                double side = scanner.nextDouble();
                return new EquilateralTriangle(side);
            }
            case 4 -> {
                System.out.println("Enter length:");
                double length = scanner.nextDouble();
                System.out.println("Enter width:");
                double width = scanner.nextDouble();
                return new Rectangle(length, width);
            }
            case 5 -> {
                System.out.println("Enter side:");
                double sideS = scanner.nextDouble();
                return new Square(sideS);
            }
            case 6 -> {
                System.out.println("Enter side:");
                double sideP = scanner.nextDouble();
                return new RegularPentagon(sideP);
            }
            default -> {
                System.out.println("Non-existent shape!");
                return null;
            }
        }
    }

    public Shape requestFormula() {
        System.out.println(SHAPES);
        int chosenShapeFormula = scanner.nextInt();
        switch (chosenShapeFormula) {
            case 1 -> {
                return new Circle(0);
            }
            case 2 -> {
                return new Triangle(0, 0, 0);
            }
            case 3 -> {
                return new EquilateralTriangle(0);
            }
            case 4 -> {
                return new Rectangle(0, 0);
            }
            case 5 -> {
                return new Square(0);
            }
            case 6 -> {
                return new RegularPentagon(0);
            }
            default -> {
                System.out.println("Non-existent shape!");
                return null;
            }
        }
    }

    public int chosenOption() {
        return scanner.nextInt();
    }
}
