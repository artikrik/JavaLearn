package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {

    ArrayList<MovablePoint> points = new ArrayList<>();

    public MovablePointsSet(int maxCoordinate, int minCoordinate,int maxSpeed, int minSpeed) {
        for (int i = 0; i < 5; i++) {
            points.add(setRandomValue(maxCoordinate, minCoordinate, maxSpeed, minSpeed));
        }
    }

    public MovablePointsSet(int numberOfPoint, int maxCoordinate, int minCoordinate,int maxSpeed, int minSpeed) {
        for (int i = 0; i < numberOfPoint; i++) {
            points.add(setRandomValue(maxCoordinate, minCoordinate, maxSpeed, minSpeed));
        }
    }

    public static int setRandomMove(int maxValueOfMove, int minValueOfMove) {
        return new Random().nextInt(maxValueOfMove) + minValueOfMove;
    }

    public MovablePoint setRandomValue(int maxCoordinate, int minCoordinate, int xSpeedRandom, int ySpeedRandom) {
        return new MovablePoint(
                new Random().nextInt(maxCoordinate-minCoordinate) + minCoordinate,
                new Random().nextInt(maxCoordinate-minCoordinate) + minCoordinate,
                new Random().nextInt(xSpeedRandom-ySpeedRandom) + ySpeedRandom,
                new Random().nextInt(xSpeedRandom-ySpeedRandom) + ySpeedRandom);
    }

    public void numberOfMove(MovablePointsSet points, int numberOfMove, int maxValueOfMove, int minValueOfMove)  {
        for (int i = 0; i < numberOfMove; i++) {
            System.out.println("Перемещаем каждую из точек " + (i + 1) + " раз");
            for (MovablePoint valueSpeed : points.points) {
                valueSpeed.move(setRandomMove(maxValueOfMove, minValueOfMove), setRandomMove(maxValueOfMove, minValueOfMove));
            }
            points.toString();
        }
    }
    @Override
    public String toString() {
        for (MovablePoint tmp : points) {
            System.out.println(tmp.toString());
        }
        return super.toString();
    }
}
