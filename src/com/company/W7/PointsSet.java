package com.company.W7;

public class PointsSet {
    public static void main (String[] args){
        MovablePointsSet movablePointsSet = new MovablePointsSet(3);
        System.out.println(movablePointsSet.toString());

        movablePointsSet.movePoints(5);


    }
}
