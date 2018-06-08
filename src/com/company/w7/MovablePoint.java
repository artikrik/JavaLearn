package com.company.w7;

public class MovablePoint extends Point {
    private int xSpeed;
    private int ySpeed;

    public MovablePoint() {
        setXSpeed(0);
        setYSpeed(0);
    }

    public MovablePoint(int xSpeed, int ySpeed) {
        super();
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint getSpeed(int xSpeed, int ySpeed) {
        return new MovablePoint(xSpeed, ySpeed);
    }

    public MovablePoint move(int xSpeed, int ySpeed) {
        super.setX(getX()+xSpeed);
        super.setY(getY()+ySpeed);
        setXSpeed(getXSpeed()+xSpeed);
        setYSpeed(getYSpeed()+ySpeed);
        return new MovablePoint();
    }

    @Override
    public String toString() {
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ')';
    }
}
