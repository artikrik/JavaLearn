package w9_Countries;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("UGANDA", 100000);
        map.put("HERASIMA", 500000);
        map.put("VINNITCA", 400000);
        map.put("TYUTKI", 3000);

        System.out.println(map.toString()); //show all countries and population

        Countries Uganda = Countries.UGANDA;
        Countries Herasima = Countries.HERASIMA;
        Countries Vinnitca = Countries.VINNITCA;
        Countries Tyutki = Countries.TYUTKI;

        System.out.println(Countries.VINNITCA.getNumberOfPopulation()); // show information about countries
    }
}
