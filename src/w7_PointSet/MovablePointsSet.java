package w7_PointSet;

import java.util.ArrayList;

public class MovablePointsSet {

    int pointNumber;
    ArrayList<MovablePoint> movablePoint = new ArrayList<>();


    public MovablePointsSet(int amountOfPoints) {
        for (int i = 0; i < amountOfPoints; i++) {
            movablePoint.add(new MovablePoint((int) (i+1),
                                              (float) (-10 + 35 * Math.random()),
                                              (float) (-10 + 35 * Math.random()),
                                              (float) (10 * Math.random()),
                                              (float) (10 * Math.random())));
        }
    }

    public void pointsMove(MovablePointsSet movablePointsSet, int amountOfMoves) {
        for (int i = 0; i < amountOfMoves; i++) {
            System.out.println("points movement " + (i +1)  + " times");
            for (MovablePoint movePoints : movablePointsSet.movablePoint) {
                movePoints.move((float) (-3 + 6 * Math.random()),
                                (float) (-3 + 6 * Math.random()));
                System.out.println(movePoints.toString());
            }
        }
    }

    @Override
    public String toString() {
        return movablePoint.toString();
    }
}