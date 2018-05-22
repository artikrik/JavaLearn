package w5;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Wine bottleOfWine = new Wine("Кагор", "Украина", new GregorianCalendar(1980, 10, 25));
        System.out.println("Вино " + bottleOfWine.getName() + " производства " + bottleOfWine.getCountryName() + " с выдержкой " + bottleOfWine.getWineAge() + " лет");
    }
}
