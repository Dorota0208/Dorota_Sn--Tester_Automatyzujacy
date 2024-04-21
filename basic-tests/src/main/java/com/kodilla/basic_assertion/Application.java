package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int squareResult = calculator.square(a);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        boolean correct1 = ResultChecker.assertEquals1(-3, subtractResult);
        boolean correct2 = ResultChecker.assertEquals1(25, squareResult);

        if (correct && correct1 && correct2) {
            System.out.println("Metody sumy, odejmowania i podnoszenia do kwadratu działają poprawnie dla liczb " + a + " i " + b);
        } else if (correct && correct1) {
            System.out.println("Metoda sumy i odejmowania działają poprawnie dla liczb " + a + " i " + b);
        } else if (correct) {
            System.out.println("Metoda sumy działa poprawnie dla liczb " + a + " i " + b);
        } else if (correct1) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else if (correct2) {
            System.out.println("Metoda podnoszenia do kwadratu działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Ani jedna z metod nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}