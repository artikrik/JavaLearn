package com.company.W7;

public class Point {

    private float x;
    private float y;

    public Point (){
        x=0;
        y=0;
    }

    public Point (float x, float y){
        setX(x);
        setY(y);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY (float x, float y){
        setX(x);
        setY(y);
    }

    public Pair getXY (){
        Pair pair = new Pair();
        pair.x=x;
        pair.y=y;
        return pair;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y + ")" ;
    }
}
