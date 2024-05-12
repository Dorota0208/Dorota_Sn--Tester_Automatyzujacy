package com.kod.collections.interfaces.homework.cars;

public class Opel implements Car{
    private int speed;
    public Opel(){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed += 8;

    }

    @Override
    public int decreaseSpeed() {
       return speed -= 4;

    }
}
