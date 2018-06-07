package com.company.w7;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){
        setXSpeed(0.0f);
        setYSpeed(0.0f);
    }

    public MovablePoint(float xSpeed, float ySpeed){
        super();
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
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

    public void setSpeed(float xSpeed, float ySpeed){
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint getSpeed(float xSpeed, float ySpeed){
        return new MovablePoint(xSpeed,ySpeed);
    }

    public MovablePoint move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+xSpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString()+",speed=(" + xSpeed + "," + ySpeed + ')';
    }
}
