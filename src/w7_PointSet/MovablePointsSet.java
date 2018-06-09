package w7_PointSet;

import java.util.Random;

public class MovablePointsSet {

    Random r  = new Random();

    int minCoordinateDiapason = 10;
    int maxCoordinateDiapason = 35;
    int minRandomSpeed = 0;
    int maxRandomSpeed = 10;
    private int pointNumber;
    private Point coordinatPoint;
    private MovablePoint movablePoint;

    public MovablePointsSet(int pointNumber) {
        if (pointNumber <= 0) {
            this.pointNumber = 5;
        } else {
            this.pointNumber = pointNumber;
        }

        MovablePoint[] movablePoints = getMovablePointsSet(this.pointNumber);
    }

    public static MovablePoint[] getMovablePointsSet (int pointNumber){
      MovablePoint[] MovablePointsSet = new MovablePoint[pointNumber];
        for (int i= 0; i < pointNumber; i++){

            MovablePointsSet[i] = new MovablePoint((float) (10 + 25 * Math.random()),
                                                (float) (10 + 25 * Math.random()),
                                                (float) (10 * Math.random()),
                                                (float) (10 * Math.random()));
      }
    return MovablePointsSet;
    }
}