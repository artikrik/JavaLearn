package TEST;


import static TEST.MovablePointsSet.numberOfMove;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создание объектов");
        MovablePointsSet movablePointsSet = new MovablePointsSet();
        movablePointsSet.toString();
        numberOfMove(movablePointsSet, 3); // метод для объект класса MovablePointsSet, который перемещает все точки 5 раз
    }
}

