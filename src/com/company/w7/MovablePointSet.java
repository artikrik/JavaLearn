package w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointSet {

    final static int COORDINATE_LOW = 10;
    final static int COORDINATE_HIGH = 35;
    final static int SPEED_LOW = 0;
    final static int SPEED_HIGH = 9;
    final static int SPEED_LOW_DIAPASON = -3;
    final static int SPEED_HIGH_DIAPASON = 3;
    final static int VALUE_OF_POINS = 5;

    ArrayList<MovablePoint> movablePointArrayList = new ArrayList<>();
    Random random = new Random();

    public int generateCoordinateRandomValue() {
        return random.nextInt((COORDINATE_HIGH - COORDINATE_LOW + 1) + COORDINATE_LOW);

    }

    public int generateSpeedRandomValue() {
        int randomSpeedNumber = random.nextInt((SPEED_HIGH - SPEED_LOW + 1) + SPEED_LOW);
        return randomSpeedNumber;
    }

    public MovablePointSet(int valueOfPoint) {
        createMovablePointSet(valueOfPoint);
    }

    public MovablePointSet() {
    }

    public void createMovablePointSet(){
        createMovablePointSet(2);
    }


    public void createMovablePointSet(int valueOfPoint) {
        for (int i = 0; i < 2; i++) {
            addPoint(new MovablePoint(generateCoordinateRandomValue(), generateCoordinateRandomValue(), 0, 0));

        }
    }

    public void addPoint(MovablePoint point){
        movablePointArrayList.add(point);
    }

    public void makeRandomMove() {
        int randomMove = random.nextInt((SPEED_HIGH_DIAPASON - SPEED_LOW_DIAPASON + 1) + SPEED_LOW_DIAPASON);


    }

    public void printPointSet(){
        for(MovablePoint point: movablePointArrayList){
            System.out.println(point.toString());
        }
        System.out.println();
    }
}

