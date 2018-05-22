package com.company.W5.W5_Car;

public class Main {
    public static void main (String[] args){

        Car car1 = new Car(2008, "bmw i8");

        car1.SpeedUp();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedUp();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedUp();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedUp();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedUp();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedDown();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedDown();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedDown();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedDown();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());
        car1.SpeedDown();
        System.out.println("Скорість car1 зараз = "+car1.getSpeed());

    }
}
