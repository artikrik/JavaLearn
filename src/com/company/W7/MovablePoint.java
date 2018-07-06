package com.company.W7;

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

    public MovablePoint(float xSpeed, float ySpeed){
        setYSpeed(ySpeed);
        setXSpeed(xSpeed);
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public Pair getSpeed() {
        Pair pair = new Pair();
        pair.xSpeed=xSpeed;
        pair.ySpeed=ySpeed;
        return pair;
    }

    public MovablePoint move(float xSpeed, float ySpeed) {
        super.setX(getX()+xSpeed);
        super.setY(getY()+ySpeed);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
        if (getX()>35|| getX()<10||getY()>35||getY()<10)
            throw new IllegalArgumentException("not allowed range");
        return new MovablePoint();
    }


    @Override
    public String toString() {
        return super.toString() + ", speed=" + "(" + xSpeed + "," + ySpeed + ")";
    }

}
