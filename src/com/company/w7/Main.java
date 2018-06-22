package com.company.w7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создание объектов");
        MovablePointsSet movablePointsSet = new MovablePointsSet(35, 10, 11, 0);
        movablePointsSet.toString();
        try {
            movablePointsSet.numberOfMove(movablePointsSet, 5, 3, -3); // метод для объект класса MovablePointsSet, который перемещает все точки 5 раз
        } catch (OverflowPointException e) {
            System.out.println(e.getMessage());
        }
    }
}
