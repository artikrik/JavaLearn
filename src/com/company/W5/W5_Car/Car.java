package com.company.W5.W5_Car;

public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car (int yearModel, String make){
        setYearModel(yearModel);
        setMake(make);
        speed=0;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearModel(){
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void SpeedUp(){
        speed+=5;
    }

    public void SpeedDown(){
        speed-=5;
    }

}
