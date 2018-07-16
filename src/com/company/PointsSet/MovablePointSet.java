package com.company.PointsSet;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointSet {

    ArrayList<MovablePoint> pointList = new ArrayList<>();

    public MovablePointSet(int points) {
        for (int i = 0; i < points; i++) {
            pointList.add(NewPointList());
        }
    }

    public MovablePointSet() {
        for (int i = 0; i < 5; i++) {
            pointList.add(NewPointList());
        }
    }

    public MovablePoint NewPointList() {
        Random random = new Random();
        int x = random.nextInt(26) + 10;
        int y = random.nextInt(26) + 10;
        int xSpeed = random.nextInt(11);
        int ySpeed = random.nextInt(11);
        return new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void movePoints(MovablePointSet movablePointsSet, int amountOfMovement) {
        for (int i = 1; i <= amountOfMovement; i++) {
            System.out.println("Значение точек после " + i + "-ого перемещения:");
            for (MovablePoint point : movablePointsSet.pointList) {
                point.move((float) new Random().nextInt(7) - 3, (float) new Random().nextInt(7) - 3);
                System.out.println(point.toString());
            }
        }
    }

    @Override
    public String toString() {
        return pointList.toString();
    }


}
