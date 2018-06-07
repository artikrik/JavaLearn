package com.company.w5;

import java.util.Comparator;
import java.util.Random;

public class Sprinter implements Comparable<Sprinter> {
    private String name;
    private int time;

    public Sprinter(String name) {
        setName(name);
        setTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime() {
        this.time = makeRandomTime();
    }

    public int makeRandomTime() {
        return new Random().nextInt(10000);
    }


    @Override
    public String toString() {
        return "Sprinter name: " + name + '\n' + "Time: " + time + " seconds";
    }

    @Override
    public int compareTo(Sprinter s) {
        return this.getTime() - s.getTime();
    }
}
