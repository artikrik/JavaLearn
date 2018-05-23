package w5_0;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Wine wine1 = new Wine("Shabodun", "France", new GregorianCalendar(1800, 4, 12));
        Wine wine2 = new Wine("Kagore", "Krim", new GregorianCalendar(2010, 1, 27));

        System.out.println(wine1.toString() + "\n" + "\n" + wine2.toString());

    }
}
