package w6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Marathon> listOfSportsmen = new ArrayList<Marathon>();

        listOfSportsmen.add(new Marathon("Эмиль", 589));
        listOfSportsmen.add(new Marathon("Пааво Нурми", 409));
        listOfSportsmen.add(new Marathon("Хайле Гебрессилайсие", 183));
        listOfSportsmen.add(new Marathon("Эмиль", 294));
        listOfSportsmen.add(new Marathon("Хишам Эль Герудж", 300));

        Collections.sort(listOfSportsmen);
        System.out.println(listOfSportsmen);

        Collections.sort(listOfSportsmen, new Comparator<Marathon>() {
            @Override
            public int compare(Marathon o1, Marathon o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        });
        System.out.println("\n" + listOfSportsmen.get(0));
        System.out.println(listOfSportsmen.get(1));
        System.out.println(listOfSportsmen.get(2));
    }
}
