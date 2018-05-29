package com.company.w5;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private String country;
    private LocalDate birthOfWine;

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", birthOfWine=" + birthOfWine +
                '}';
    }

    public Wine(String name, String country, LocalDate birthOfWine) {
        setName(name);
        setCountry(country);
        setBirthOfWine(birthOfWine);
    }

    public static int calculateAgeOfWineInYears(Wine wine) {
        LocalDate currentDate = LocalDate.now();
        if (wine.birthOfWine != null) {
            return Period.between(wine.birthOfWine, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBirthOfWine() {
        return birthOfWine;
    }

    public void setBirthOfWine(LocalDate birthOfWine) {
        this.birthOfWine = birthOfWine;
    }

    public int getAgeOfWine() {
        return calculateAgeOfWineInYears(this);
    }
}
