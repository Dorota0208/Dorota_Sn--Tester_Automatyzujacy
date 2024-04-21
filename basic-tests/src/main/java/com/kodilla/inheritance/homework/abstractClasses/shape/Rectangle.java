package com.kodilla.inheritance.homework.abstractClasses.shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width * height;
    }
    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}


