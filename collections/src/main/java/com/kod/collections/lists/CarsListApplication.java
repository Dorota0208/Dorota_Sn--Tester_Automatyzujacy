package com.kod.collections.lists;

import com.kod.collections.arrays.homework.CarUtils;
import com.kod.collections.interfaces.homework.cars.Bentley;
import com.kod.collections.interfaces.homework.cars.Car;
import com.kod.collections.interfaces.homework.cars.Ford;
import com.kod.collections.interfaces.homework.cars.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford());
        cars.add(new Opel());
        cars.add(new Bentley());

        System.out.println("Zawartość kolekcji samochodów:");
        for (Car car : cars) {
            CarUtils.displayCarInfo(car);
        }
        cars.remove(1);
        Car opel = new Opel();
        cars.remove(opel);

        System.out.println("Zawartość kolekcji samochodów po usunięciach:");
        for (Car car : cars) {
            CarUtils.displayCarInfo(car);
        }
        System.out.println("Rozmiar kolekcji: " + cars.size());
    }
}
