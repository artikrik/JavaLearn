package w7_PointSet;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
    }

    public MovablePoint() {
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
    }

    public MovablePoint getSpeed() {
        return new MovablePoint(xSpeed,ySpeed);
    }

    public String toString (){
        return "(x,y), speed = (xs,ys)";
    }

    public MovablePoint move(float xSpeed, float ySpeed){
       super.setX(getX()+xSpeed);
       super.setY(getY()+ySpeed);
       setxSpeed(getxSpeed()+xSpeed);
       setySpeed(getySpeed()+ySpeed);
       return new MovablePoint();
    }
}