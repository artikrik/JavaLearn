package com.company.week7;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public Pair speed;

    public MovablePoint() {
        super();
        setSpeed(0.0f, 0.0f);
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        setSpeed(xSpeed, ySpeed);
    }

    public  MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        setSpeed(xSpeed, ySpeed);
    }
    public void setxSpeed(float xSpeed) { this.xSpeed = xSpeed; }

    public float getxSpeed() { return xSpeed; }

    public void setySpeed(float ySpeed) { this.ySpeed = ySpeed; }

    public float getySpeed() { return ySpeed; }

    public MovablePoint setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
        return this;
    }

    public MovablePoint getSpeed() {
        return new MovablePoint(speed.x, speed.y);
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "Speed=(" + getxSpeed() + "," + getySpeed() + ")";
    }
}
