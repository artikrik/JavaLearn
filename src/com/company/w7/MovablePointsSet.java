package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {

    final int minCoordinate = 10;
    final int maxCoordinate = 26;
    final int minSpeed = 0;
    final int maxSpeed = 11;
    ArrayList<MovablePoint> points = new ArrayList<>();

    public MovablePointsSet() {
        for (int i = 0; i < 5; i++) {
            points.add(setRandomValue(maxCoordinate, minCoordinate, maxSpeed, minSpeed));
        }
    }

    public MovablePointsSet(int numberOfPoint) {
        for (int i = 0; i < numberOfPoint; i++) {
            points.add(setRandomValue(maxCoordinate, minCoordinate, maxSpeed, minSpeed));
        }
    }

    public static int setRandomMove(int maxValueOfMove, int minValueOfMove) {
        return new Random().nextInt(maxValueOfMove) + minValueOfMove;
    }

    public MovablePoint setRandomValue(int maxCoordinate, int minCoordinate, int xSpeedRandom, int ySpeedRandom) {
        return new MovablePoint(
                new Random().nextInt(maxCoordinate) + minCoordinate,
                new Random().nextInt(maxCoordinate) + minCoordinate,
                new Random().nextInt(xSpeedRandom) + ySpeedRandom,
                new Random().nextInt(xSpeedRandom) + ySpeedRandom);
    }

    public static void numberOfMove(MovablePointsSet movablePointsSet, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Перемещаем каждую из точек " + (i + 1) + " раз");
            for (MovablePoint valueSpeed : movablePointsSet.points) {
                valueSpeed.move(setRandomMove(7, -3), setRandomMove(7, -3));
            }
            movablePointsSet.toString();
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
