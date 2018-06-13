package com.company.w7;

import static com.company.w7.MovablePointsSet.setRandomMove;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создание объектов");
        MovablePointsSet movablePointsSet = new MovablePointsSet(26,10,11,0);
        movablePointsSet.toString();
        numberOfMove(movablePointsSet, 5, 7,-3); // метод для объект класса MovablePointsSet, который перемещает все точки 5 раз
    }

    public static void numberOfMove(MovablePointsSet movablePointsSet, int numberOfMove, int maxValueOfMove, int minValueOfMove) {
        for (int i = 0; i < numberOfMove; i++) {
            System.out.println("Перемещаем каждую из точек " + (i + 1) + " раз");
            for (MovablePoint valueSpeed : movablePointsSet.points) {
                valueSpeed.move(setRandomMove(maxValueOfMove, minValueOfMove), setRandomMove(maxValueOfMove, minValueOfMove));
            }
            movablePointsSet.toString();
        }
    }
}
