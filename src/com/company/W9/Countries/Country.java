package com.company.W9.Countries;

public class Country {

    private String name;
    private int population;

    public Country(String name, int population) {
        setName(name);
        setPopulation(population);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

}
