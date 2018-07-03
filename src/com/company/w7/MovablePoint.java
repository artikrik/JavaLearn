package w7;


import javafx.util.Pair;

public class MovablePoint extends Point{
    private int xSpeed = 0;
    private int ySpeed = 0;

    public MovablePoint() {
    }

    public MovablePoint(int xSpeed, int ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x,y);
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

    public Pair<Integer, Integer> getSpeed() {
        return new Pair<>(xSpeed, ySpeed);
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint move() {
        setXY(getX() + getXSpeed(), getY() + getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + getXSpeed() + "," + getYSpeed() + ")";
    }
}
