package com.company.Countries;

public class Countries {

    private String countryName;
    private Long population;

    public Countries(String countryName, Long population) {
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public Long getPopulation() {
        return population;
    }

}
