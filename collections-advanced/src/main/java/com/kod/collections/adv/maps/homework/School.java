package com.kod.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> studentInClasses = new ArrayList<>();
    private String name;
    private List<Integer> studentsInClasses;
    public School(String name) {
        this.name = name;
        this.studentsInClasses = new ArrayList<>();
    }
    public void addStudents(Integer... students) {
        for (Integer student : students) this.studentsInClasses.add(student);
    }
    public int getTotalStudents() {
        int total = 0;
        for (Integer studentsInClass : studentsInClasses) {
            total += studentsInClass;
        }
        return total;
    }
    public String getName() {
        return name;
    }
}
