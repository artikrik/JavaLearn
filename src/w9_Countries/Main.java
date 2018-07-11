package w9_Countries;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Countries,Integer> map = new HashMap<>();
        map.put(Countries.UGANDA,100000);
        map.put(Countries.USA, 500000);
        map.put(Countries.UKRAINE, 400000);
        map.put(Countries.TURKEY, 3000);

        for (Map.Entry map2: map.entrySet()) {
            System.out.println(map2.getKey()+" = "+map2.getValue()); //show all countries and population
        }

        System.out.println("\n"+map.get(Countries.UGANDA)); // show information about countries
        System.out.println(map.get(Countries.USA)); // show information about countries
        System.out.println(map.get(Countries.UKRAINE)); // show information about countries
        System.out.println(map.get(Countries.TURKEY)); // show information about countries
    }
}
