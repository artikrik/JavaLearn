package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {

    ArrayList<MovablePoint> pointFromSet = new ArrayList<>();
    int maxCoordinate;
    int minCoordinate;

    public MovablePointsSet(int maxCoordinate, int minCoordinate, int maxSpeed, int minSpeed) {
        this.maxCoordinate = maxCoordinate;
        this.minCoordinate = minCoordinate;
        for (int i = 0; i < 5; i++) {
            pointFromSet.add(setRandomValueForConstuctor(maxCoordinate, minCoordinate, maxSpeed, minSpeed));
        }
    }

    public MovablePointsSet(int numberOfPoint, int maxCoordinate, int minCoordinate, int maxSpeed, int minSpeed) {
        this.maxCoordinate = maxCoordinate;
        this.minCoordinate = minCoordinate;
        for (int i = 0; i < numberOfPoint; i++) {
            pointFromSet.add(setRandomValueForConstuctor(maxCoordinate, minCoordinate, maxSpeed, minSpeed));
        }
    }

    public MovablePoint setRandomValueForConstuctor(int maxCoordinate, int minCoordinate, int xSpeedRandom, int ySpeedRandom) {
        return new MovablePoint(
                new Random().nextInt(maxCoordinate - minCoordinate) + minCoordinate,
                new Random().nextInt(maxCoordinate - minCoordinate) + minCoordinate,
                new Random().nextInt(xSpeedRandom - ySpeedRandom) + ySpeedRandom,
                new Random().nextInt(xSpeedRandom - ySpeedRandom) + ySpeedRandom);
    }

    public static int setRandomMove(int maxValueOfMove, int minValueOfMove) {
        return new Random().nextInt(maxValueOfMove) + minValueOfMove;
    }

    public void numberOfMove(MovablePointsSet pointsSet, int numberOfMove, int maxValueOfMove, int minValueOfMove) throws OverflowPointException {
        for (int i = 0; i < numberOfMove; i++) {
            System.out.println("Перемещаем каждую из точек " + (i + 1) + " раз");
            int xCheck=0, yCheck=0;
            for (MovablePoint currentPoint : pointsSet.pointFromSet) {
                // PROBLEMS :
                xCheck = currentPoint.moveX(setRandomMove(maxValueOfMove, minValueOfMove)).getX();
                System.out.println(xCheck);
                yCheck = currentPoint.moveY(setRandomMove(maxValueOfMove, minValueOfMove)).getY();

                do {
                    if (xCheck > maxCoordinate || xCheck < minCoordinate) {
                        xCheck = currentPoint.getX() - currentPoint.getXSpeed();
                        throw new OverflowPointException("X coordinate can't be bigger " + maxCoordinate + " or smaller than " + minCoordinate);
                    }

                }
                while (xCheck > maxCoordinate || xCheck < minCoordinate);
                do {
                    if (yCheck > maxCoordinate || yCheck < minCoordinate) {
                        yCheck = currentPoint.getY() - currentPoint.getYSpeed();
                        throw new OverflowPointException("Y coordinate can't be bigger " + maxCoordinate + " or smaller than " + minCoordinate);
                    }
                }
                while (yCheck > maxCoordinate || yCheck < minCoordinate);
                currentPoint.moveX(xCheck);
                currentPoint.moveY(yCheck);
            }
            pointsSet.toString();
        }
    }

    @Override
    public String toString() {
        for (MovablePoint movablePoint : pointFromSet) {
            System.out.println(movablePoint.toString());
        }
        return super.toString();
    }
}
