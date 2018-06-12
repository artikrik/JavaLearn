package w7_PointSet;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private int id;

    public MovablePoint(int id, float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.id = id;
    }

    public MovablePoint(int id, float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public MovablePoint getSpeed(int id, float xSpeed, float ySpeed) {
        return new MovablePoint(id, xSpeed, ySpeed);
    }

    public MovablePoint move(float xSpeed, float ySpeed) {
        super.setX(getX() + xSpeed);
        super.setY(getY() + ySpeed);
        setxSpeed(getxSpeed() + xSpeed);
        setySpeed(getySpeed() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "point # " + id + " " + super.toString() + "speed =" + "(" + getxSpeed() + ", " + getySpeed() + ")";
    }
}