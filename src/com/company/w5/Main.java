package w5;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Wine bottleOfWine = new Wine("Кагор", "Украина", new GregorianCalendar(1980, 10, 25));
        System.out.println("Вино " + bottleOfWine.getName() + " производства " + bottleOfWine.getCountryName() + " с выдержкой " + bottleOfWine.getWineAge() + " лет");

        Car mercedes = new Car("Mercedes", 60, 2017);
        System.out.println(mercedes.toString() + "\n");

        for (int i = 0; i < 5; i++) {
            mercedes.setSpeed(mercedes.getAcceleration());
            System.out.println(mercedes.speedToString());
        }
        {
            System.out.print("\n");
        }
        for (int i = 0; i < 5; i++) {
            mercedes.setSpeed(mercedes.getbraking());
            System.out.println(mercedes.speedToString());
        }
    }
}