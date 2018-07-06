package w7;

import java.util.Random;

public class Move {
    public static void main(String[] args) {
        System.out.println("Program 1:");
        MovablePoint point1 = new MovablePoint(1.0f, 1.0f);
        float maxPointValue = 20.0f;
        float speed = 1.0f;
        while (point1.getX() != maxPointValue || point1.getY() != maxPointValue) {
            point1.move(speed, speed);
            System.out.println(point1.toString());
        }

        System.out.println("\n" + "Program 2:");

        float xCoordinate = (float) new Random().nextInt(26)+10;

        float yCoordinate = (float) new Random().nextInt(26)+10;

        float xSpeed = (float) new Random().nextInt(11);
        float ySpeed = (float) new Random().nextInt(11);

        MovablePoint point2 = new MovablePoint(xCoordinate, yCoordinate, xSpeed, ySpeed);

        Random MoveSpeedX = new Random();
        float moveSpeedX;

        Random MoveSpeedY = new Random();
        float moveSpeedY;

        int amountOfMoving = 10;
        for (int i = 0; i < amountOfMoving; i++){
            moveSpeedX = (float) new Random().nextInt(4);
            moveSpeedY = (float) new Random().nextInt(4);
            point2.move(moveSpeedX, moveSpeedY);

        }
    }
}
