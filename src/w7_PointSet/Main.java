package w7_PointSet;

public class Main {
    public static void main(String[] args) {

        MovablePointsSet movablePointsSet = new MovablePointsSet(5);

        System.out.println(movablePointsSet.toString());

        movablePointsSet.pointsMove(movablePointsSet, 5);
    }
}
