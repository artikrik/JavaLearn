package w5;


public class Car {
    private String brand;
    private int speed;
    private int yearModel;

    public Car(String brand, int speed, int yearModel) {
        setBrand(brand);
        setSpeed(speed);
        setYearModel(yearModel);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getBrand(String brand) {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearModel(int yearModel) {
        return yearModel;
    }

    public int getAcceleration() {
        return speed + 5;
    }

    public int getbraking() {
        return speed - 5;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", yearModel=" + yearModel +
                '}';
    }

    public String speedToString() {
        return "Car current speed = " + speed;
    }
}

