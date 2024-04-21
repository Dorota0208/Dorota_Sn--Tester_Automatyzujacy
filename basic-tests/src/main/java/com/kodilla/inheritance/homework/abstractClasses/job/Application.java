package com.kodilla.inheritance.homework.abstractClasses.job;

public class Application {
    public static void main(String[] args) {

        Job teacherJob = new Teacher(6000,"Teaching students");
        Job doctorJob = new Doctor (9000, "Diagnosing and treating patients");
        Job mechanicalEngineerJob = new MechanicalEngineer (8000,"Designing and analyzing mechanical systems");

        Person adam = new Person("Adam", 28, teacherJob);
        Person karol = new Person("Karol", 32, doctorJob);
        Person alicja = new Person("Alicja", 29, mechanicalEngineerJob);
        System.out.println("Adam's information:");
        adam.displayInformation();
        System.out.println();

        System.out.println("Karol's information:");
        karol.displayInformation();
        System.out.println();

        System.out.println("Alicja's information:");
        alicja.displayInformation();

    }
}
