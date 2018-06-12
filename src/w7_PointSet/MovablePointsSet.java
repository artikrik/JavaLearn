package w7_PointSet;

import java.util.ArrayList;

public class MovablePointsSet {

    int pointNumber;
    ArrayList<MovablePoint> movablePoint = new ArrayList<>();


    public MovablePointsSet() {
        movablePoint.add(new MovablePoint((float) (-10 + 35 * Math.random()),
                                          (float) (-10 + 35 * Math.random()),
                                          (float) (10 * Math.random()),
                                          (float) (10 * Math.random())));
    }

    public void pointsMove(MovablePointsSet movablePointsSet, int amountOfPoints) {
        for (int i = 0; i < amountOfPoints; i++) {
            for (MovablePoint movePoints : movablePointsSet.movablePoint) {
                movePoints.move((float) (-3 + 6 * Math.random()),
                                (float) (-3 + 6 * Math.random()));
                System.out.println(movePoints.toString());
            }
        }
    }

    public void MovablePointsSet(int numberOfMovement) {
        System.out.println();
        for (int i = 0; i < numberOfMovement; i++) {
            System.out.println("move point " + (i+1) + " times");
        }
    }


    @Override
    public String toString() {
        return movablePoint.toString();
    }
}