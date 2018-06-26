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

        Random randomXcoordinate = new Random();
        float xCoordinate = (float) randomXcoordinate.nextInt(26)+10;

        Random randomYcoordinate = new Random();
        float yCoordinate = (float) randomYcoordinate.nextInt(26)+10;

        Random randomXspeed = new Random();
        float xSpeed = (float) randomXspeed.nextInt(21) - 10;

        Random randomYspeed = new Random();
        float ySpeed = (float) randomYspeed.nextInt(21) - 10;

        MovablePoint point2 = new MovablePoint(xCoordinate, yCoordinate, xSpeed, ySpeed);

        Random randomMoveSpeedX = new Random();
        float moveSpeedX;

        Random randomMoveSpeedY = new Random();
        float moveSpeedY;

        int amountOfMoving = 10;
        for (int i = 0; i < amountOfMoving; i++){
            moveSpeedX = (float) randomMoveSpeedX.nextInt(4);
            moveSpeedY = (float) randomMoveSpeedY.nextInt(4);
            point2.move(moveSpeedX, moveSpeedY);
            System.out.println(point2.toString());
        }
    }
}
