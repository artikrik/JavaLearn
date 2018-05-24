package com.company.week5;


public class Car {
    private int yearModel;
    private String make;
    private int speed;
    int speedUnit = 5;

    public Car (int yearModel, String make) {
        setYearModel(yearModel);
        setMake(make);
        setSpeed(0);
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

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void addAccelerationToCar () {
        setSpeed(speed + speedUnit);
    }

    public void makeCarSlowDown () {
        if (speed > speedUnit) {
            setSpeed(speed - speedUnit);
        }
        else setSpeed(0);
    }

    public void showSpeed () {
        System.out.println("Speed of car after change: " + getSpeed());
    }

    public void showResultOfChangeSpeedFewTimes  (int times, String speedChange) {
        for (int i = 1; i <= times; i++) {
            changeSpeed(speedChange);
            showSpeed();
        }
    }

    public void changeSpeed (String speedChange) {
        if (speedChange.equals("+")) {
            addAccelerationToCar();
        }
        else if (speedChange.equals("-")) {
            makeCarSlowDown();
        }
    }
}
