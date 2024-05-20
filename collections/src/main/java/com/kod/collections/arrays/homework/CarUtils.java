package com.kod.collections.arrays.homework;

import com.kod.collections.interfaces.homework.cars.Bentley;
import com.kod.collections.interfaces.homework.cars.Car;
import com.kod.collections.interfaces.homework.cars.Ford;
import com.kod.collections.interfaces.homework.cars.Opel;

public class CarUtils {
    public static void displayCarInfo(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car type: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Car increased speed: " + car.increaseSpeed());
        System.out.println("Car decreased speed: " + car.decreaseSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof Bentley)
            return "Bentley";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown shape name";
    }
}


