package com.company.W7;

public class PointsSet {
    public static void main (String[] args){
        MovablePointsSet movablePointsSet = new MovablePointsSet(2);
        System.out.println(movablePointsSet.toString());

        movablePointsSet.movePoints(movablePointsSet, 5);
    }
}
