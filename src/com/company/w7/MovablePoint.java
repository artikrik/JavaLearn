package com.company.w7;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    private float x;
    private float y;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        setX(x);
        setY(y);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        setX(super.getX());
        this.y = super.getY();
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public void setY(float y) {
        this.y = y;
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

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }


    class Fig {
        private float x;
        private float y;

        Fig(float x, float y) {
            this.x = getX();
            this.y = getY();
        }
    }

    private Fig getXY() {
        return new Fig(x, y);
    }

    class FigSpeed {
        private float xSpeed;
        private float ySpeed;

        FigSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = getXSpeed();
            this.ySpeed = getYSpeed();
        }
    }

    private FigSpeed getSpeed() {
        return new FigSpeed(xSpeed, ySpeed);
    }

    void move(MovablePoint movablePoint) {
        movablePoint.setX(x += xSpeed);
        y += ySpeed;
    }

    @Override
    public String toString() {
        return "(" + getXY().x +
                "," + getXY().y +
                ")" + ", speed=(" + getSpeed().xSpeed + "," + getSpeed().ySpeed + ")";
    }
}
