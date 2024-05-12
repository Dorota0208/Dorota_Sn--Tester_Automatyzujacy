package com.kod.collections.interfaces.homework.cars;

public class Ford implements Car {
    private int speed;
    public Ford(){
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
      return speed += 10;
    }

    @Override
    public int decreaseSpeed() {
        return speed -= 5;

    }
}
