package com.company.week7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointSet {
    private Random r = new Random();
    private ArrayList<MovablePoint> set = new ArrayList<>();
    private int pointQuantity = 5;

    public MovablePointSet() {
        createMovablePoint(this.pointQuantity);
    }

    public MovablePointSet(int pointQuantity) {
        createMovablePoint(pointQuantity);
    }

    private float getRandomNumber(int from, int to) {
        return (float)(r.nextInt(to - from + 1) + from);
    }

    private void createMovablePoint(int pointQuantity) {
        for(int i = 0; i < pointQuantity; i++) {
            set.add(new MovablePoint(getRandomNumber(10,35),
                                     getRandomNumber(10,35),
                                     getRandomNumber(0,10),
                                     getRandomNumber(0,10)));
        }
    }

    public MovablePointSet movePoints() {
        for(MovablePoint mp: set) {
            mp.setSpeed(setRandomSpeed(),setRandomSpeed()).move();
        }
        return this;
    }

    private float setRandomSpeed() {
        return getRandomNumber(-3, 3);
    }

    public void printPoints() {
        System.out.println(set.toString());
    }
}
