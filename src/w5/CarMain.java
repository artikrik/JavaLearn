package w5;

public class CarMain {

    public static void main(String[] args) {
        accelerationAndBreaking();
    }

    private static void accelerationAndBreaking() {
        Car wagen = new Car(2001, "Авто1", 5, -5);
        Car wagen2 = new Car(2006, "Авто2", 6, -3);

        accelerationSteps(wagen, 5);
        accelerationSteps(wagen2, 5);

        breakingSteps(wagen, 5);
        breakingSteps(wagen2, 5);
    }

    private static void accelerationSteps(Car someCar, int accelerationTimes) {
        int changeSpeed = 0;
        speedMessage(someCar,"начало ускорения");
        while(changeSpeed < accelerationTimes) {
            someCar.setSpeed("Accelerate");
            showSpeed(someCar.getSpeed());
            changeSpeed++;
        }
    }

    private static void breakingSteps(Car someCar, int breakingTimes) {
        speedMessage(someCar, "начало торможения");
        while(breakingTimes > 0) {
            someCar.setSpeed("Break");
            showSpeed(someCar.getSpeed());
            breakingTimes--;
        }
    }

    private static void speedMessage(Car someCar, String message) {
        System.out.println(someCar.getMake()+ " " + someCar.getYearModel() + " года " + message);
    }

    private static void showSpeed(int speed) {
        System.out.println(speed);
    }
}

