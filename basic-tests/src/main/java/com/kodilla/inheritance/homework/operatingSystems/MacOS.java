package com.kodilla.inheritance.homework.operatingSystems;

public class MacOS extends OperatingSystem {
    public MacOS(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn() {
        System.out.println("Starting macOS");
    }
    @Override
    public void turnOff() {
        System.out.println("Shutting down macOS");
    }
}


