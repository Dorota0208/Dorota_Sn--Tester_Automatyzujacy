package com.kodilla.inheritance.homework.operatingSystems;

public class Application {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows(2022);
        OperatingSystem macos = new MacOS(2023);

        System.out.println("Windows release year: " + windows.getReleaseYear());
        windows.turnOn();
        windows.turnOff();

        System.out.println("macOS release year: " + macos.getReleaseYear());
        macos.turnOn();
        macos.turnOff();
    }
}
