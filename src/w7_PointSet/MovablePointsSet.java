package w7_PointSet;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {

 //   Random r  = new Random();

/*    int minCoordinateDiapason = 10;
    int maxCoordinateDiapason = 35;
    int minRandomSpeed = 0;
    int maxRandomSpeed = 10;*/
    private int pointNumber;
    private Point coordinatPoint;
    private ArrayList<MovablePoint> movablePoint;

    public MovablePointsSet(int pointNumber) {
        if (pointNumber <= 0) {
            this.pointNumber = 5;
        } else {
            this.pointNumber = pointNumber;
        }

        MovablePoint[] movablePoint = getMovablePointsSet(this.pointNumber);
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

    public void movePointsSet (MovablePointsSet movablePointsSet, int pointNumber){
        ArrayList<MovablePoint> movablePoints = movablePointsSet.movablePoint;

        for (int i = 0; i < movablePoints.size(); i++){
            MovablePoint point = movablePoints.get(i);
            System.out.println("element" + i + 1 + movablePointsSet.movablePoint.get(i).toString());

            for (int y = 0; y<pointNumber; i++){
                point.move((float)(-3 + 6 * Math.random()));
                System.out.println(" " + point.toString());
            }
        }
    }

    public String toString(){
        for (MovablePoint p : movablePoint){
            System.out.println(p.toString());
        }
return super.toString();
    }

}