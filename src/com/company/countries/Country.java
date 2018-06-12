package com.company.countries;

public class Country {
    public String name;
    public Long population;

    public Country(String name, Long population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
