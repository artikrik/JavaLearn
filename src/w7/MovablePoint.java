package w7;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float[] getSpeed() {
        float[] xySpeed = new float[2];
        xySpeed[0] = xSpeed;
        xySpeed[1] = ySpeed;
        return xySpeed;
    }

    @Override
    public String toString() {
        return "x = " + super.getX() + ", y = " + super.getY() + ", xSpeed = " + this.xSpeed + ", ySpeed = " + this.ySpeed;
    }

    public MovablePoint move(float xSpeed, float ySpeed) {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    }

}
