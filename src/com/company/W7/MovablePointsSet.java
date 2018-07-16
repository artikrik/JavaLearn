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

    public void movePoints(  int amountOfMovement) {
        for (int i = 1; i <= amountOfMovement; i++) {
            System.out.println("Значення полів всіх точок після " + i + "-ого переміщення:");
            for (MovablePoint point : listPoints) {
                try {
                    point.move((float) new Random().nextInt(7) - 3, (float) new Random().nextInt(7) - 3);
                    System.out.println(point.toString());
                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }
            }
        }
    }

    @Override
    public String toString() {
        return listPoints.toString();
    }
}
