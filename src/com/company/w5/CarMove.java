package com.company.w5;

public class CarMove {
    public static void main(String[] args) {
        Car car = new Car(2008, "BMW");

        System.out.println("Accelerate");
        for (int i = 0; i < 5; i++) {
            car.accelerateCar();
            System.out.println("Car speed: " + car.getSpeed());
        }

        System.out.println("Slow Down");

        for (int i = 0; i < 5; i++) {
            car.slowDownCar();
            System.out.println("Car speed: " + car.getSpeed());
        }
    }
}
