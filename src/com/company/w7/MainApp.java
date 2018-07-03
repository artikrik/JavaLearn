package w7;

import java.util.Random;

public class MainApp {
    private static Random random = new Random();
    private final static int SPEED_MIN = -3;
    private final static int SPEED_MAX = 3;

    public static int generateSpeed() {
        return SPEED_MIN + random.nextInt(SPEED_MAX - SPEED_MIN + 1);
    }

    public static int generate(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static void main(String... args) {
        MovablePointSet pointSet = new MovablePointSet();
        pointSet.addPoint(new MovablePoint(15, 15, 0, 0));
        pointSet.addPoint(new MovablePoint(20, 20, 0, 0));
        pointSet.addPoint(new MovablePoint(25, 15, 0, 0));


        System.out.println(pointSet);
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                int xSpeed = generateSpeed();
                int ySpeed = generateSpeed();
                System.out.println("Speed: " + xSpeed + ", " + ySpeed);
                pointSet.move(xSpeed, ySpeed);

                System.out.println(pointSet);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
