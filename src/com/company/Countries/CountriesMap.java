package com.company.Countries;

import java.util.HashMap;
import java.util.Map;

public class CountriesMap {

    private Map<String, Long> hashMap = new HashMap<>();

    public void addCountry(Countries countries) {
        hashMap.put(countries.getCountryName(), countries.getPopulation());
    }

    public void print() {
        for (Map.Entry map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

    public Long search(String name) {
        return hashMap.get(name);
    }
}
