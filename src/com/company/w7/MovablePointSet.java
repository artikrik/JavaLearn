package w7;

import java.util.ArrayList;

public class MovablePointSet {

    final static int COORDINATES_MIN = 10;
    final static int COORDINATES_MAX = 35;

    private ArrayList<MovablePoint> points = new ArrayList<>();

    public MovablePointSet() {
    }

    public MovablePointSet(int numberOfPoints) {
        for (int i = 0; i < numberOfPoints; i++) {
            points.add(new MovablePoint(generateCoordinate(), generateCoordinate(), 0, 0));
        }
    }

    public boolean isValid(Point point) {
        return COORDINATES_MIN <= point.getX() && point.getX() <= COORDINATES_MAX &&
                COORDINATES_MIN <= point.getY() && point.getY() <= COORDINATES_MAX;
    }

    public void addPoint(MovablePoint point) {
        if (isValid(point)) {
            points.add(point);
        } else {
            throw new IllegalArgumentException("Coordinates are out of allowed limits");
        }
    }

    public int generateCoordinate() {
        return MainApp.generate(COORDINATES_MIN, COORDINATES_MAX);
    }

    public void move(int xSpeed, int ySpeed) {
        for (MovablePoint p: points) {
            p.setSpeed(xSpeed, ySpeed);
            p.move();
            if (!isValid(p)) {
                throw new IllegalStateException("Point " + p + " is out of allowed range [" + COORDINATES_MIN + "," + COORDINATES_MAX + "]");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (MovablePoint p: points) {
            s.append(p).append("\r\n");
        }
        return s.toString();
    }
}

