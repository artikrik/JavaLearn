package w5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        ArrayList<Wine> listOfWine = new ArrayList<>();

        listOfWine.add(new Wine("Каберне Совиньон", "Италия", new GregorianCalendar(2003, 8, 10)));
        listOfWine.add(new Wine("Шардоне", "Франция", new GregorianCalendar(2003, 9, 15)));
        listOfWine.add(new Wine("Шираз", "Франция", new GregorianCalendar(1995, 5, 28)));
        listOfWine.add(new Wine("Дом Периньон", "Франция", new GregorianCalendar(1996, 5, 28)));
        listOfWine.add(new Wine("Вдова Клико", "Франция", new GregorianCalendar(2003, 8, 18)));

        int tempArrayLength = listOfWine.size();
        int[] tempArray = new int[tempArrayLength];
        for (int i = 0; i < listOfWine.size(); i++) {
            tempArray[i] = listOfWine.get(i).wineAge();
        }
        Arrays.sort(tempArray);
        int tmp = tempArray[tempArrayLength - 1];
        for (int i = 0; i < tempArray.length; i++) {
            if (tmp == listOfWine.get(i).wineAge())
                System.out.println(listOfWine.get(i));
        }
//        Wine bottleOfWine = new Wine("Кагор", "Украина", new GregorianCalendar(1980, 10, 25));
//        System.out.println("Вино " + bottleOfWine.getName() + " производства " + bottleOfWine.getCountryName() + " с выдержкой " + bottleOfWine.getWineAge() + " лет");
//
//        Car mercedes = new Car("Mercedes", 60, 2017);
//        System.out.println(mercedes.toString() + "\n");
//
//        for (int i = 0; i < 5; i++) {
//            mercedes.setSpeed(mercedes.getAcceleration());
//            System.out.println(mercedes.speedToString());
//        }
//        {
//            System.out.print("\n");
//        }
//        for (int i = 0; i < 5; i++) {
//            mercedes.setSpeed(mercedes.getBraking());
//            System.out.println(mercedes.speedToString());
//        }
    }
}