package com.company.w7;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        setX(x);
        setY(y);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint() {
        super();
        setXSpeed(0.0f);
        setYSpeed(0.0f);
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    MovablePoint move(float xSpeed, float ySpeed) {
        setSpeed(getXSpeed() + xSpeed,getYSpeed() + ySpeed);
        super.setX(getX() + getXSpeed());
        super.setY(getY() + getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + getSpeed()[0] + "," + getSpeed()[1] + ")";
    }
}
