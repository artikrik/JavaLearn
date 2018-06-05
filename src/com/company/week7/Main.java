package com.company.week7;


public class Main {
    public static void main(String[] args) {
        MovablePointSet set = new MovablePointSet();
        System.out.println("Created points set");
        set.printPoints();
        for(int i = 0; i < 5; i++) {
            System.out.println("Points after " + (i+1) + " move");
            set.movePoints().printPoints();
        }
    }
}
