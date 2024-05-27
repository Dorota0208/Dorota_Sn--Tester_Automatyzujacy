package com.kod.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Ford", 2.0, 2.5, true));
        stamps.add(new Stamp("Opel", 3.0, 4.0, false));
        stamps.add(new Stamp("Audi", 2.5, 2.5, true));
        stamps.add(new Stamp("Ford", 2.0, 2.5, true));  // duplikat

        System.out.println("Number of unique stamps: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}