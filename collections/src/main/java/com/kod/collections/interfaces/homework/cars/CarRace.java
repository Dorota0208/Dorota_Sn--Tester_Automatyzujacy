package com.kod.collections.interfaces.homework.cars;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Opel opel = new Opel();
        Bentley bentley = new Bentley();

        doRace(ford);
        doRace(opel);
        doRace(bentley);
    }
    public static void doRace(Car car){
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("Final speed of " + car.getClass().getSimpleName() + ": " + car.getSpeed());
    }
}

