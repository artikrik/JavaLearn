/*Программа должна сначала вывести список всех участников забега,
        отсортированный по именам (в лексикографическом порядке),
        а если имена одинаковые, тогда по времени бега от меньшего к большему.
        После этого программа должна вывести список трех призеров.*/

package w6_MarathonComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<MarathoneCompAndCompar> arrayList = new ArrayList<>();
        arrayList.add(new MarathoneCompAndCompar("Begunovenko", 15));
        arrayList.add(new MarathoneCompAndCompar("Petrov", 3));
        arrayList.add(new MarathoneCompAndCompar("Begunova", 5));
        arrayList.add(new MarathoneCompAndCompar("Morgunov", 40));
        arrayList.add(new MarathoneCompAndCompar("Begunova", 13));
        arrayList.add(new MarathoneCompAndCompar("Plavunov", 47));

        Collections.sort(arrayList, new Comparator<MarathoneCompAndCompar>() {
            @Override
            public int compare(MarathoneCompAndCompar m1, MarathoneCompAndCompar m2) {
                return m1.getTime() - m2.getTime();
            }
        });
// Где вывод всех участников?
        for (MarathoneCompAndCompar marathone : arrayList) ;  // зачем эта строка? или что здесь делает символ ";"?
        System.out.println(arrayList.get(0).toString() + "\n" + arrayList.get(1).toString() + "\n" + arrayList.get(2).toString());
    }
}
