package com.kod.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<School, Principal> schoolPrincipalMap = new HashMap<>();

        Principal principal1 = new Principal("Jan Kowalski");
        Principal principal2 = new Principal("Anna Nowak");

        School school1 = new School("Primary School");
        school1.addStudents(20, 25, 24, 24, 23, 25, 20, 25, 24, 24, 23, 25);
        schoolPrincipalMap.put(school1, principal1);

        School school2 = new School("High School");
        school2.addStudents(25, 23, 24, 24, 24, 20, 25, 24, 24, 23, 25);
        schoolPrincipalMap.put(school2, principal2);

        for (Map.Entry<School, Principal> entry : schoolPrincipalMap.entrySet()) {
            School school = entry.getKey();
            Principal principal = entry.getValue();
            System.out.println("School: " + school.getName() +
                    ", Principal: " + principal.getName() +
                    ", Total Students: " + school.getTotalStudents());
        }
    }
}
