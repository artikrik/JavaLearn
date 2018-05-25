package com.company.Car;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", 2018, 150);
        System.out.println(BMW.toString() + "\n");

        for (int i = 0; i < 5; i++) {
            BMW.setSpeed(BMW.getAcceleration());
            System.out.print(BMW.speedAsselerationToString() + "\n");
        }
        System.out.println(" ");

        for (int i = 0; i < 5; i++){
            BMW.setSpeed(BMW.getBreaking());
            System.out.print(BMW.speedBreakingtoString() + "\n");
        }
    }
}
