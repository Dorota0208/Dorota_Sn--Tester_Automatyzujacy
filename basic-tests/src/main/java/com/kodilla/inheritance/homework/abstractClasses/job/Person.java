package com.kodilla.inheritance.homework.abstractClasses.job;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayInformation() {
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Job responsibilities: " + job.getResponsibilities());
        System.out.println("Salary: " + job.getSalary());
    }
}


