package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet extends MovablePoint {
    private int count;
    private ArrayList<MovablePoint> movablePoints = new ArrayList<>();

    public MovablePointsSet(int count) {
        setCount(count);
        for (int x = 0; x < count; x++) {
            movablePoints.add(setRandomToMovablePoint());
        }
    }

    public MovablePointsSet() {
        setCount();
        for (int x = 0; x < count; x++) {
            movablePoints.add(setRandomToMovablePoint());
        }
    }

    private int getCount() {
        return count;
    }

    private void setCount() {
        setCount(5);
    }

    private void setCount(int count) {
        this.count = count;
    }

    private MovablePoint setRandomToMovablePoint() {
        float minCoord = 10f;
        float maxCoord = 35f;
        float minSpeed = 0f;
        float maxSpeed = 10f;
        Random random = new Random();

        return new MovablePoint(
                random.nextFloat() * (maxCoord - minCoord) + minCoord,
                random.nextFloat() * (maxCoord - minCoord) + minCoord,
                random.nextFloat() * (maxSpeed - minSpeed) + minSpeed,
                random.nextFloat() * (maxSpeed - minSpeed) + minSpeed
        );
    }

    static void pointSetMove(MovablePointsSet movablePointsSet, int times) {
        ArrayList<MovablePoint> movablePoints1 = movablePointsSet.movablePoints;
        for (int i1 = 0; i1 < movablePoints1.size(); i1++) {
            MovablePoint point = movablePoints1.get(i1);
            System.out.println("Элемент номер " + i1+1 + movablePointsSet.movablePoints.get(i1).toString());
            for (int i = 0; i < times; i++) {
                point.move(new Random().nextFloat() * (3 - -3) + -3);
                System.out.println(">>>" + point.toString());
            }
        }

    }

    @Override
    public String toString() {
        for (MovablePoint m : movablePoints) {
            System.out.println(m.toString());
        }
        return super.toString();
    }

}
