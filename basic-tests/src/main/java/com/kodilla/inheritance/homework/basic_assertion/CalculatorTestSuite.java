package com.kodilla.inheritance.homework.basic_assertion;

import org.junit.Test;

import static com.kodilla.inheritance.homework.basic_assertion.ResultChecker.assertEquals2;
import static org.junit.Assert.assertEquals;


public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 3;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(5, subtractResult);
    }
    @Test
    public void testSquare_PositiveNumber() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals2(25.0, squareResult, 0.001);
    }
    @Test
    public void testSquare_Zero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = calculator.square(a);
        assertEquals2(0.0, squareResult, 0.001);
    }
    @Test
    public void testSquare_NegativeNumber() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResult = calculator.square(a);
        assertEquals2(25.0, squareResult, 0.001);
    }
}


