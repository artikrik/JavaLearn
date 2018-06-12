package com.company.W7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {

    ArrayList<MovablePoint> listPoints = new ArrayList<>();

    public MovablePointsSet(int numberPoints) {
        for (int i = 0; i < numberPoints; i++) {
            listPoints.add(CreateListPoints());
        }
    }

    public MovablePointsSet() {
        for (int i = 0; i < 5; i++) {
            listPoints.add(CreateListPoints());
        }
    }

    public MovablePoint CreateListPoints() {
        Random random = new Random();
        int x = random.nextInt(26) + 10;
        int y = random.nextInt(26) + 10;
        int xSpeed = random.nextInt(11);
        int ySpeed = random.nextInt(11);
        return new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void movePoints (MovablePointsSet movablePointsSet, int amountOfMovement) {
        Random random = new Random();
        for (int i = 0; i < amountOfMovement; i++) {
            for (MovablePoint point : movablePointsSet.listPoints) {
                point.move((float) random.nextInt(7) - 3, (float) random.nextInt(7) - 3);
                System.out.println(point.toString());
            }
        }
    }

    @Override
    public String toString() {
        return listPoints.toString();
    }
}
