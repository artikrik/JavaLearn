package w9_Countries;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("UGANDA", 100000);
        map.put("USA", 500000);
        map.put("UKRAINE", 400000);
        map.put("TURKEY", 3000);

        for (Map.Entry map2: map.entrySet()) {
            System.out.println(map2.getKey()+" = "+map2.getValue()); //show all countries and population
        }
        Countries Uganda = Countries.UGANDA;
        Countries USA = Countries.USA;
        Countries Ukarine = Countries.UKRAINE;
        Countries Turkey = Countries.TURKEY;

        System.out.println(Countries.UGANDA.getNumberOfPopulation()); // show information about countries
        System.out.println(Countries.USA.getNumberOfPopulation()); // show information about countries
        System.out.println(Countries.UKRAINE.getNumberOfPopulation()); // show information about countries
        System.out.println(Countries.TURKEY.getNumberOfPopulation()); // show information about countries
    }
}
