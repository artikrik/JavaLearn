package com.company.w5.Car;

public class Car {
    private int yearModel;
    private String make;
    private int speed;
    private int numberOfrepetion;

    public Car(int yearModel, String make) {
        setYearModel(yearModel);
        setMake(make);
        setSpeed(0);
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void acceleration() {
        speed += 5;
    }

    protected void breaking() {
        speed -= 5;
    }


    @Override
    public String toString() {
        return "Car{" + "speed=" + speed + '}';
    }

    public int getNumberOfrepetion() {
        return numberOfrepetion;
    }

    public void setNumberOfrepetion(int numberOfrepetion) {
        this.numberOfrepetion = numberOfrepetion;
    }
}
