package com.kod.collections.arrays.homework;

import com.kod.collections.interfaces.homework.cars.Bentley;
import com.kod.collections.interfaces.homework.cars.Car;
import com.kod.collections.interfaces.homework.cars.Ford;
import com.kod.collections.interfaces.homework.cars.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random random = new Random();
    public static Car drawCar() {
        int drawnCarType = random.nextInt(3);

        switch (drawnCarType) {
            case 0:
                return new Bentley();
            case 1:
                return new Ford();
            case 2:
                return new Opel();
            default:
                return null;
        }
    }
    public static void main(String[] args) {

        int size = random.nextInt(15) + 1;
        Car[] cars = new Car[size];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (int i = 0; i < cars.length; i++) {
            CarUtils.displayCarInfo(cars[i]);
        }
    }
}


