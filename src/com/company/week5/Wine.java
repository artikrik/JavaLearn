package com.company.week5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Wine {
    private String name;
    private String country;
    private LocalDate dateOfProduction;

    public Wine (String name, String country, LocalDate dateOfProduction) {
        setName(name);
        setCountry(country);
        setDateOfProduction(dateOfProduction);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public int calculateAgeingOfWine () {
        return Period.between(dateOfProduction,LocalDate.now()).getYears();
    }

    public String getDateString (LocalDate dateOfProduction) {
        return dateOfProduction.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", dateOfProduction=" + getDateString(dateOfProduction) +
                '}';
    }
}
