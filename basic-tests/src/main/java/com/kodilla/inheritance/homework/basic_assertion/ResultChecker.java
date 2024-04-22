package com.kodilla.inheritance.homework.basic_assertion;

public class ResultChecker {
    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }
    public static boolean assertEquals1(int expected, int actual) {
        return expected == actual;
    }
    public static boolean assertEquals2(double expected, double actual, double delta) {
        return expected - actual <= delta ;
    }
}
