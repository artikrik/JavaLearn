package w6_WineCollection;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        ArrayList<WineCollection> wineCollection = new ArrayList<>();
        wineCollection.add(new WineCollection("Shabodun", "France", new GregorianCalendar(1800, 4, 12)));
        wineCollection.add(new WineCollection("Kagore", "Krim", new GregorianCalendar(2010, 1, 27)));
        wineCollection.add(new WineCollection("Marami", "Hawaiy", new GregorianCalendar(2000, 11, 4)));
        wineCollection.add(new WineCollection("Kagore", "Krim", new GregorianCalendar(1970, 5, 13)));

        System.out.println(wineCollection);

    }
}
