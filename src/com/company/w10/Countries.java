package com.company.w10;

public class Countries {

    private String country;
    private Long population;

    Countries(String country, Long population) {
        this.country = country;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public Long getPopulation() {
        return population;
    }
}
