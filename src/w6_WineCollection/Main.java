package w6_WineCollection;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {

        ArrayList<WineCollection> arrayList = new ArrayList<WineCollection>();
        arrayList.add(new WineCollection("Shabodun", "France", new GregorianCalendar(1800, 5, 13)));
        arrayList.add(new WineCollection("Kagore", "Krim", new GregorianCalendar(2010, 1, 27)));
        arrayList.add(new WineCollection("Marami", "Hawaiy", new GregorianCalendar(1970, 11, 4)));
        arrayList.add(new WineCollection("Kagore", "Krim", new GregorianCalendar(2000, 5, 13)));
        arrayList.add(new WineCollection("Kagorenei", "Krimatoriy", new GregorianCalendar(2010, 5, 13)));

        //arrayList.sort(WineCollection.Extracting);

        int minExtracting = arrayList.get(0).wineExtract();

        for (WineCollection i : arrayList) {
            if (minExtracting >= i.wineExtract()) {
                minExtracting = i.wineExtract();
            }
        }
        youngestWine(arrayList, minExtracting);

        System.out.println(youngestWine(arrayList,minExtracting));
    }

    public static ArrayList<WineCollection> youngestWine(ArrayList<WineCollection> arrayList, int minExtracting) {
        ArrayList<WineCollection> youngestWine = new ArrayList<>();
        for (WineCollection w : arrayList) {
            if (minExtracting == w.wineExtract()) {
                youngestWine.add(w);
            }
        }
        return youngestWine;
    }
}