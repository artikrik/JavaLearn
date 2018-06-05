package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet extends ArrayList<MovablePoint> {
    private int numberOfPoint;

    public int getNumberOfPoint() {
        return numberOfPoint;
    }

    public void setNumberOfPoint(int numberOfPoint) {
        this.numberOfPoint = numberOfPoint;
    }

    public MovablePointsSet() {
        setNumberOfPoint(5);
    }

    public MovablePointsSet(int numberOfPoin) {
        setNumberOfPoint(numberOfPoin);
    }

    public static ArrayList<MovablePoint> createPointCatalog(int number, ArrayList<MovablePoint> pointCatalog) {
        for (int i = 0; i < number; i++) {
            pointCatalog.add(
                    new MovablePoint(new Random().nextInt(26) + 10, new Random().nextInt(25) + 10, new Random().nextInt(11),
                                     new Random().nextInt(11)));
        }
        return pointCatalog;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        MovablePointsSet pointMoveExample = new MovablePointsSet();
        createPointCatalog(pointMoveExample.getNumberOfPoint(), pointMoveExample);
        for (MovablePoint tmp : pointMoveExample) {
            System.out.println(tmp.toString());
        }
        for (MovablePoint tmp : pointMoveExample) {
            tmp.move();
        }


    }
}
