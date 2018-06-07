package com.company.w7;

import java.util.ArrayList;
import java.util.Random;

public class MovablePointsSet {
    ArrayList<MovablePoint> points = new ArrayList<>();

    public MovablePointsSet() {
        for (int i = 0; i < 5; i++) {
            points.add(new MovablePoint(10 + new Random().nextInt(26) + 10, new Random().nextInt(26) + 10, new Random().nextInt(11), new Random().nextInt(11)));
        }
    }

    public MovablePointsSet(int numberOfPoint) {
        for (int i = 0; i < numberOfPoint; i++) {
            points.add(new MovablePoint(new Random().nextInt(26) + 10, new Random().nextInt(26) + 10, new Random().nextInt(11), new Random().nextInt(11)));
        }
    }

    @Override
    public String toString() {
        for (MovablePoint tmp : points) {
            System.out.println(tmp.toString());
        }
        return super.toString();
    }

    public static void numberOfMove(MovablePointsSet movablePointsSet, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Перемещаем каждую из точек " + (i + 1) + " раз");
            for (MovablePoint valueSpeed : movablePointsSet.points) {
                valueSpeed.move(new Random().nextInt(7) - 3, new Random().nextInt(7) - 3);
            }
            movablePointsSet.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("Создание объектов");
        MovablePointsSet movablePointsSet = new MovablePointsSet();
        movablePointsSet.toString();
        numberOfMove(movablePointsSet, 5); // метод для объект класса MovablePointsSet, который перемещает все точки 5 раз
    }
}
