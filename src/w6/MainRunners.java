package w6;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



public class MainRunners {
    public static void main(String[] args) {
        showInfoAboutRunners();
        List<Runners> runners = createListOfRunners();

        List<Runners> fastestRunner = getAllFastestRunner(runners, fastestRunner(runners));
        for (Runners runner : fastestRunner) {
            System.out.println(runner);
        }
    }

    private static List<Runners> createListOfRunners() {

        List<Runners> listOfRunners = new ArrayList<>();
        listOfRunners.add(new Runners("NoName1\n", "NoWhere1\n", LocalTime.of(12, 20, 35)));
        listOfRunners.add(new Runners("NoName2\n", "NoWhere2\n", LocalTime.of(12,20,30)));
        listOfRunners.add(new Runners("NoName3\n", "NoWhere3\n", LocalTime.of(12,20,25)));

        return listOfRunners;
    }

    private static void showInfoAboutRunners() {
        List<Runners> ListOfRunners = createListOfRunners();
        for (Runners i : ListOfRunners) {
            System.out.println(i.toString());
        }
    }

    public static long fastestRunner(List<Runners> list) {
        long minValue = list.get(0).winningTime();
        for (Runners tmp : list) {
            if (tmp.winningTime() < minValue) minValue = tmp.winningTime();
        }
        return minValue;
    }

    public static List<Runners> getAllFastestRunner(List<Runners> list, long minValue) {
        List<Runners> ListOfRunners = new ArrayList<>();

        for (Runners tmp : list) {
            if (minValue == tmp.winningTime()) {
                ListOfRunners.add(tmp);
            }
        }
        return ListOfRunners;
    }
}