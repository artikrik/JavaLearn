package w7;


import javafx.util.Pair;

public class MovablePoint extends Point {
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super();
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    MovablePoint(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    MovablePoint() {
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public Pair<Float, Float> getSpeed() {
        Pair<Float, Float> point = new Pair<>(xSpeed, ySpeed);
        return point;
    }

    public Pair<Float, Float> move() {
        float x = getX();
        float y = getY();
        x += xSpeed;
        y += ySpeed;
        setXY(x, y);
        return super.getXY();
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x
                + ", y=" + y +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
