package com.company.w5;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private static LocalDate currentDate;
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
        this.name = name;
        this.country = country;
        this.birthOfWine = birthOfWine;
    }


    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
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

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public static void setCurrentDate(LocalDate currentDate) {
        Wine.currentDate = LocalDate.now();
    }
}
