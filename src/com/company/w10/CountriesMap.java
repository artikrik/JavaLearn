package com.company.w10;

import java.util.HashMap;
import java.util.Map;

public class CountriesMap {
    private Map<String, Long> hashMap = new HashMap<>();

    public void addCountry(Countries country) {
        hashMap.put(country.getCountry(), country.getPopulation());
    }

    public void print() {
        for (Map.Entry map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

    public Long searchByKey(String name) {
        if (hashMap.containsKey(name))return hashMap.get(name);
        else throw new IllegalArgumentException("Country " + name + " was not found");
    }
}
