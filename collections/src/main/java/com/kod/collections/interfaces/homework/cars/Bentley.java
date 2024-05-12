package com.kod.collections.interfaces.homework.cars;

public class Bentley implements Car {
    private int speed;
    public Bentley(){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public int increaseSpeed() {
        return speed += 9;
    }

    @Override
    public int decreaseSpeed() {
        return speed -= 5;
    }
}
