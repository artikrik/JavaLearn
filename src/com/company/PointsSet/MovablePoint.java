package com.company.PointsSet;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint() {
        super();
        xSpeed = 0;
        ySpeed = 0;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public MovablePoint move(float xSpeed, float ySpeed) {
        super.setX(getX() + xSpeed);
        super.setY(getY() + ySpeed);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
        return new MovablePoint();
    }

    @Override
    public String toString() {
        return super.toString() + "Скорость x = " + xSpeed + ", Скорость y = " + ySpeed + "\n";
    }

}
