/*Доработать класс Wine таким образом, чтобы указанную задачу решал следующий код:

        ArrayList<Wine> winesSet = new ArrayList<>();
        winesSet.add(new Wine(…));  //… означает вызов Вашего конструктора
        winesSet.add(new Wine(…));
        winesSet.add(new Wine(…));
        …
        Wine youngestWine = Collections.min(winesSet);

        for (Wine wine : winesSet) {
        if (youngestWine.compareTo(wine) == 0) {
        System.out.println(wine.toString());
        }
        }*/

package w6_WineCollectionComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        ArrayList<Wine> winesSet = new ArrayList<>();
        winesSet.add(new Wine("Shato", "Krim", new GregorianCalendar(2000, 3, 12)));
        winesSet.add(new Wine("Kroto", "Grusia", new GregorianCalendar(2001, 4, 20)));
        winesSet.add(new Wine("Mrato", "Frnce", new GregorianCalendar(1982, 3, 15)));

        Wine youngestWine = Collections.min(winesSet);

        for (Wine wine : winesSet) {
            if (youngestWine.compareTo(wine) == 0) {
                System.out.println(wine.toString());
            }
        }
    }
}