package com.company.w7;

public class Point {

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    private float x;
    private float y;

    public Point(float x, float y) {
        setX(x);
        setY(y);
    }

    public Point() {
        setX(0.0f);
        setY(0.0f);
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ")";
    }
}
