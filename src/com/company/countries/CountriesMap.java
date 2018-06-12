package com.company.countries;

import java.util.HashMap;
import java.util.Map;

public class CountriesMap {
    Map<String, Country> countries;

    public CountriesMap() {
        this.countries = new HashMap<>();
    }

    public void printCountries(){
        for(Map.Entry m:countries.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public void addCountry(Country country) {
        countries.put(country.name, country);
    }

    public Country findCountry(String countryName){
        if (countries.containsKey(countryName))
            return countries.get(countryName);
        else throw new IllegalArgumentException("Country " + countryName + " was not found");
    }
}
