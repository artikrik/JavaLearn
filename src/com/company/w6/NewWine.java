package com.company.w6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class NewWine implements Comparable<NewWine>, Comparator<NewWine> {
    private String name;
    private String country;
    private LocalDate birthOfWine;

    @Override
    public String toString() {
        return "NewWine{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", birthOfWine=" + birthOfWine +
                '}';
    }

    public NewWine(String name, String country, LocalDate birthOfWine) {
        setName(name);
        setCountry(country);
        setBirthOfWine(birthOfWine);
    }

    public static int calculateAgeOfWineInYears(NewWine newWine) {
        LocalDate currentDate = LocalDate.now();
        if (newWine.birthOfWine != null) {
            return Period.between(newWine.getBirthOfWine(), currentDate).getYears();
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

    @Override
    public int compareTo(NewWine newWine) {
        return this.getAgeOfWine() - newWine.getAgeOfWine();
    }

    @Override
    public int compare(NewWine newWine1Age, NewWine newWine2Age) {  // Одинаковые компараторы. Стоит ли дублировать в одном классе? Или потренировались?
        return newWine1Age.getAgeOfWine() - newWine2Age.getAgeOfWine();
    }
}
