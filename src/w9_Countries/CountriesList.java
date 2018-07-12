package w9_Countries;

import java.util.HashMap;
import java.util.Map;

public class CountriesList {

    Map<Countries, Integer> map = new HashMap<>();

    public void showListOfCountries() {
        for (Map.Entry map2 : map.entrySet()) {
            System.out.println(map2.getKey() + " = " + map2.getValue());
        }
    }

    public void showListOfPopulation() {
        for (Map.Entry map2 : map.entrySet()) {
            System.out.println(map2.getValue());
        }
    }
}