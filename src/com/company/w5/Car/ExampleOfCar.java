package com.company.w5.Car;

public class ExampleOfCar {
    public static void main(String[] args) {
        Car car1 = new Car(2017, "Tesla");
        car1.setNumberOfrepetion(5);

        for (int i = 0; i < car1.getNumberOfrepetion(); i++) {
            car1.action('+');
            System.out.println(car1.getSpeed());
        }
        for (int i = 0; i < car1.getNumberOfrepetion(); i++) {
            car1.action('-');
            System.out.println(car1.getSpeed());
        }

    }
}
