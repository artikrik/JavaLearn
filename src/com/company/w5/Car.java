package com.company.w5;

public class Car {
    private int yearModel;
    private String make;
    private int speed;
    private final int speedChange = 5;

    public Car(int yearModel, String make) {
        setYearModel(yearModel);
        setMake(make);
        setSpeed(0);
    }

    public void accelerateCar() {
        setSpeed(speed + speedChange);
    }

    public void slowDownCar() {
        if (speed > speedChange)
            setSpeed(speed - speedChange);
        else setSpeed(0);
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
