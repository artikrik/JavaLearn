package w7_PointSet;


public class Main {
    public static void main(String[] args) {
        System.out.println("New points with it's coordinate");

        MovablePointsSet movablePointsSet = new MovablePointsSet(5);

        movablePointsSet.toString();

        movablePointsSet.pointsMove(movablePointsSet, 5);
    }
}
