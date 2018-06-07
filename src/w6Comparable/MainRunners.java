package w6Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainRunners {
    public static void main(String[] args) {
        List<Runners> listOfRunners = new ArrayList<Runners>();
        listOfRunners.add(new Runners("a", "NoWhere1", 343));
        listOfRunners.add(new Runners("b", "NoWhere2",343));
        listOfRunners.add(new Runners("c", "NoWhere3", 552));

        Collections.sort(listOfRunners, new Comparator<Runners>() {

            @Override
            public int compare(Runners o1, Runners o2) {
                return o1.getTime() - o2.getTime();
            }
        });
        System.out.println("\n" + listOfRunners.get(0));
        System.out.println(listOfRunners.get(1));
        System.out.println(listOfRunners.get(2));
    }
}

