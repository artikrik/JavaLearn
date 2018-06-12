package w7_PointSet;

import java.util.ArrayList;

public class MovablePointsSet {

    private int pointNumber;
    private ArrayList<MovablePoint> movablePoint = new ArrayList<>();

    public MovablePointsSet(int pointNumber) {
        if (pointNumber <= 0) {
            this.pointNumber = 5;
        }
          else {
            this.pointNumber = pointNumber;
        }

        MovablePoint [] movablePoint = getMovablePointsSet(this.pointNumber);
    }

    public MovablePoint[] getMovablePointsSet(int pointNumber) {
        MovablePoint[] MovablePointsSet = new MovablePoint[pointNumber];
        for (int i = 0; i < pointNumber; i++) {

            MovablePointsSet[i] = new MovablePoint((float) (10 + 25 * Math.random()),
                                                   (float) (10 + 25 * Math.random()),
                                                   (float) (10 * Math.random()),
                                                   (float) (10 * Math.random()));
        }
        return MovablePointsSet;
    }

    public void pointsMove (MovablePointsSet movablePointsSet, int movesCount){
        for (int i = 0; i < movesCount; i++){
            for (MovablePoint movePoints: movablePointsSet.movablePoint){
                movePoints.move((float) (-3 + 6 * Math.random()),
                                (float) (-3 + 6 * Math.random()));
                System.out.println(movePoints.toString());
            }
        }
    }

    @Override
    public String toString(){
        return movablePoint.toString();
    }
}