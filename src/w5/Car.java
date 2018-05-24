package w5;

public class Car {
    private int yearModel;
    private String make;
    private int speed;
    private int speedAcceleration;
    private int speedBreaking;

    Car(int yearModel, String make, int speedAcceleration, int speedBreaking) {
        this.yearModel = yearModel;
        this.make = make;
        this.speedAcceleration = speedAcceleration;
        this.speedBreaking = speedBreaking;
        speed = 0;
    }

    public void setSpeed(String speedDifference) {
        if (speedDifference.equals("Accelerate")) {
            speed += speedAcceleration;
        }
        else {
            speed += speedBreaking;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }
}
