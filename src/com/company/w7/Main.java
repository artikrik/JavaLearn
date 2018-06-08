package com.company.w7;

import static com.company.w7.MovablePointsSet.pointSetMove;

public class Main {
    public static void main(String[] args) {

        MovablePointsSet movablePointsSet = new MovablePointsSet(3);
        pointSetMove(movablePointsSet,5);
//        MovablePointsSet.pointSetMove(movablePointsSet);
//        movablePointsSet.toString();
    }
}
