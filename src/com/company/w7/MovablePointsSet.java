package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {
    private static final float MIN_COORD = 10f;
    private static final float MAX_COORD = 35f;
    private static final float MIN_SPEED = 0f;
    private static final float MAX_SPEED = 10f;
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

    public ArrayList<MovablePoint> getMovablePoints() {
        return movablePoints;
    }

    private void setCount() {
        setCount(5);
    }

    private void setCount(int count) {
        this.count = count;
    }

    private MovablePoint setRandomToMovablePoint() {
        Random random = new Random();

        return new MovablePoint(
                random.nextFloat() * (MAX_COORD - MIN_COORD) + MIN_COORD,
                random.nextFloat() * (MAX_COORD - MIN_COORD) + MIN_COORD,
                0f,
                0f
        );
    }

    static void pointSetMove(MovablePointsSet movablePointsSet, int times) {
        ArrayList<MovablePoint> movablePoints1 = movablePointsSet.movablePoints;

        for (int i1 = 0; i1 < movablePoints1.size(); i1++) {
            MovablePoint point = movablePoints1.get(i1);
            System.out.println("Элемент номер " + i1 + " " + movablePointsSet.movablePoints.get(i1).toString());
            for (int i = 0; i < times; i++) {
                point.move(new Random().nextFloat() * (3 - -3) + -3, new Random().nextFloat() * (3 - -3) + -3);
//                if (point.getX()>MAX_COORD&&point.getX()<MIN_COORD&&point.getY()>MAX_COORD&&point.getY()<MIN_COORD)
                System.out.println(">>>" + point.toString());
            }
        }

    }

    @Override
    public String toString() {
//        getMovablePoints().size();
        for (int i = 0; i < getMovablePoints().size(); i++) {
            return getMovablePoints().get(i).toString();
        }
        return super.toString();
    }

}
