package com.kodilla.inheritance.homework.abstractClasses.shape;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    double calculateArea() {
        // Załóżmy, że to jest trójkąt o dowolnym boku.
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}


