package w6Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainRunners {
    public static void main(String[] args) {
        List<Runner> listOfRunners = new ArrayList<>();
        listOfRunners.add(new Runner("Вася", "NoWhere3", 33));
        listOfRunners.add(new Runner("Ася", "NoWhere1",34));
        listOfRunners.add(new Runner("Петя", "NoWhere2", 35));

        Collections.sort(listOfRunners);
        System.out.println(listOfRunners);

        Collections.sort(listOfRunners, new Comparator<Runner>() {

            @Override
            public int compare(Runner o1, Runner o2) {
                return o1.getTime() - o2.getTime();
            }
        });
        System.out.println(listOfRunners.get(0));
        System.out.println(listOfRunners.get(1));
        System.out.println(listOfRunners.get(2));
    }
}

