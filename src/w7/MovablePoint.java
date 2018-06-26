package w7;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super.setX(x);
        super.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){}

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

    public float[] getSpeed(){
        float[] xySpeed = new float[2];
        xySpeed[0] = xSpeed;
        xySpeed[1] = ySpeed;
        return xySpeed;
    }

    public String toString(){
        return "x = "+ super.getX() + ", y = " + super.getY() + ", xSpeed = " + this.xSpeed + ", ySpeed = " + this.ySpeed;
    }

    public MovablePoint move(float xSpeed, float ySpeed){
        super.setX(super.getX()+xSpeed);
        setxSpeed(xSpeed);
        float moveXOnValue = super.getX();
        super.setY(super.getY()+ySpeed);
        setySpeed(ySpeed);
        float moveYOnValue = super.getY();
        return new MovablePoint(moveXOnValue, moveYOnValue, xSpeed, ySpeed);
    }
}
