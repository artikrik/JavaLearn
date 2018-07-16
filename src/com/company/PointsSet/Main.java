package com.company.PointsSet;

public class Main {
    public static void main(String[] args) {
        MovablePointSet movablePointSet = new MovablePointSet(2);
        System.out.println(movablePointSet.toString());
        movablePointSet.movePoints(movablePointSet, 5);
    }

}
