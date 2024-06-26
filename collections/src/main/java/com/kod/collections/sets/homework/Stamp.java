package com.kod.collections.sets.homework;

import java.util.Objects;
public class Stamp {
    private final String name;
    private final double width;
    private final double height;
    private final boolean isStamped;
    public Stamp(String name, double width, double height, boolean isStamped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.isStamped = isStamped;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.height, height) == 0 &&
                isStamped == stamp.isStamped &&
                Objects.equals(name, stamp.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, isStamped);
    }
    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", isStamped=" + isStamped +
                '}';
    }
}