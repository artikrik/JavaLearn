package com.company.W9.Countries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryMap {
    Map<String, Integer> map = new HashMap<>();

    public void addCountryInList(String country, Integer population) {
        map.put(country, population);
    }

    public void printInfoAboutCountries() {
        for (Map.Entry<String, Integer> myMap : map.entrySet())
            System.out.println(myMap);
    }

    public void searchInfoByCountry(String name){
        Set<String> keys = map.keySet();
        for (String key : keys){
            if (key == name)
                System.out.println("Інфа по заданій країні - "+key +", населення=" + map.get(key) );
        }
    }

}
