package com.company.week7;

public class Point {
    public Pair coordinate = new Pair();
    public float x;
    public float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        setX(0.0f);
        setY(0.0f);
    }

    public void setX(float x) { this.x = x; }

    public float getX() { return x; }

    public void setY(float y) { this.y = y; }

    public float getY() { return y; }

    public Point getXY() {
        return new Point(coordinate.x, coordinate.y);
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() +")";
    }
}
