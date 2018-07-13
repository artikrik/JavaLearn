package w10;

import java.util.HashMap;
import java.util.Map;


public class CountriesMap {
    private Map<String, Long> hashMap = new HashMap<>();

    public void addCountry(Country country) {
        hashMap.put(country.getName(), country.getPopulation());
    }

    public void print() {
        for (Map.Entry map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

    public Long searchByKey(String name) {
        return hashMap.get(name);
    }
}

