package w7;

import javafx.util.Pair;

public class Point {
    public float x;
    public float y;

    Point(float x, float y) {
        setX(x);
        setY(y);
    }

    Point() {
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Pair<Float, Float> getXY() {
        Pair<Float, Float> point = new Pair<>(x, y);
        return point;
    }

    @Override
    public String toString() {
        return "Point{" + this.getX() + "," + this.getY() + ")";
    }
}
