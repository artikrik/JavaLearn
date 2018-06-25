package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {

    private ArrayList<MovablePoint> pointFromSet = new ArrayList<>();
    int maxCoordinate;
    int minCoordinate;

    public MovablePointsSet(int maxCoordinate, int minCoordinate, int maxSpeed, int minSpeed) {
        this.maxCoordinate = maxCoordinate;
        this.minCoordinate = minCoordinate;
        for (int i = 0; i < 5; i++) {
            pointFromSet.add(setRandomValueForConstuctor( maxSpeed, minSpeed));
        }
    }

    public MovablePointsSet(int numberOfPoint, int maxCoordinate, int minCoordinate, int maxSpeed, int minSpeed) {
        new MovablePointsSet(maxCoordinate, minCoordinate, maxSpeed, minSpeed);
        for (int i = 0; i < numberOfPoint; i++) {
            pointFromSet.add(setRandomValueForConstuctor( maxSpeed, minSpeed));
        }
    }

    public MovablePoint setRandomValueForConstuctor( int xSpeedRandom, int ySpeedRandom) {
        return new MovablePoint(
                new Random(4).nextInt(maxCoordinate - minCoordinate) + minCoordinate,
                new Random(4).nextInt(maxCoordinate - minCoordinate) + minCoordinate,
                new Random(4).nextInt(xSpeedRandom - ySpeedRandom) + ySpeedRandom,
                new Random(4).nextInt(xSpeedRandom - ySpeedRandom) + ySpeedRandom);
    }

    public static int setRandomMove(int maxValueOfMove, int minValueOfMove) {
        return new Random().nextInt(maxValueOfMove) + minValueOfMove;
    }

    public void pointMove(MovablePointsSet pointsSet, int maxValueOfMove, int minValueOfMove) throws OverflowPointException {
        int xCheck, yCheck;

        for (MovablePoint currentPoint : pointsSet.pointFromSet) {
            // Сохраняем значение рандома для (х,у)
            xCheck = setRandomMove(maxValueOfMove, minValueOfMove);
            yCheck = setRandomMove(maxValueOfMove, minValueOfMove);

            // проверка вышла ли точка  за диапазон (текущее значение + рандомное)
            if (!checkXCoordinaDontOverflow(xCheck, currentPoint)) {
                //xCheck = currentPoint.getX() - currentPoint.getXSpeed();
                throw new OverflowPointException("X coordinate can't be bigger " + maxCoordinate + " or smaller than " + minCoordinate + "; Point(x)=" + (xCheck+currentPoint.getX()));
            }
            if (!checkYCoordinaDontOverflow(yCheck, currentPoint)) {
               // yCheck = currentPoint.getX() - currentPoint.getXSpeed();
                throw new OverflowPointException("Y coordinate can't be bigger " + maxCoordinate + " or smaller than " + minCoordinate+ "; Point(y)=" + (yCheck+currentPoint.getY()));
            }
            currentPoint.moveX(xCheck);
            currentPoint.moveY(yCheck);
        }
        pointsSet.print();
    }

    private boolean checkXCoordinaDontOverflow(int value, MovablePoint currentPoint) {
        if (value + currentPoint.getX() > maxCoordinate || value + currentPoint.getX() < minCoordinate) return false;
        else return true;
    }

    private boolean checkYCoordinaDontOverflow(int value, MovablePoint currentPoint) {
        if (value + currentPoint.getY() > maxCoordinate || value + currentPoint.getY() < minCoordinate) return false;
        else return true;
    }

    static void repeatMove(MovablePointsSet pointsSet, int numberOfMove, int maxValueOfMove, int minValueOfMove) {
        for (int i = 0; i < numberOfMove; i++) {
            System.out.println("Перемещаем каждую из точек " + (i + 1) + " раз");
            pointsSet.pointMove(pointsSet, maxValueOfMove, minValueOfMove);
        }
    }

    public void print() {
        for (MovablePoint movablePoint : pointFromSet) {
            System.out.println(movablePoint.toString());
        }
    }
}
