package com.company.Car;

public class Car {
    private String brand;
    private int yearModel;
    private int speed;

    public Car(String brand, int yearModel, int speed) {
        setBrand(brand);
        setYerModel(yearModel);
        setSpeed(speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private void setYerModel(int yearModel) {
        this.yearModel = yearModel;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }


    public int getSpeed(int speed) {
        return speed;
    }

    public int getYearModel(int yearModel) {
        return yearModel;
    }

    public String getBrand(String brand) {
        return brand;
    }


    public int getAcceleration() {
        return speed += 5;
    }

    public int getBreaking() {
        return speed -= 5;
    }

    @Override
    public String toString() {
        return "Авто марки " + brand + " " + yearModel +
                " года выпуска, с начальной скоростью " + speed;
    }

    public String speedAsselerationToString() {
        return "Скорость авто с ускорением: " + speed;
    }

    public String speedBreakingtoString(){
        return "Скорость авто с торможением: " + speed;
    }
}
