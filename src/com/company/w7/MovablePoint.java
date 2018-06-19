package com.company.w7;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static float MIN_COORD = 10f;

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

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    void move(float xSpeed, float ySpeed) {
        setSpeed(getXSpeed() + xSpeed, getYSpeed() + ySpeed);
        float MAX_COORD = 35f;
        super.setX(getX() + getXSpeed());
        super.setY(getY() + getYSpeed());
        if (super.getX() > MAX_COORD) {
            System.out.print(ANSI_RED + "\tThe number of X is " + getX() + "(more than max) set MAX VALUE and move " +
                    "- speed\n" +
                    ANSI_RESET);
            do {
                super.setX(getX() - getXSpeed());
            } while (getX() > MAX_COORD);
        }
        if (getY() > MAX_COORD) {
            System.out.print(ANSI_RED + "\tThe number of Y is " + getY() + "(more than max) set MAX VALUE and move " +
                    "- speed\n" +
                    ANSI_RESET);
            do {
                super.setY(getY() - getYSpeed());
            } while (getY() > MAX_COORD);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + getSpeed()[0] + "," + getSpeed()[1] + ")";
    }
}
