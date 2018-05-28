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


    public static int calculateAgeOfWineInYears(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        // не понятно, что делает метод? Вычисляет разность выдержек между двумя винами? или свой возраст?
        if (birthDate != null) {  // birthDate и currentDate это поля или параметры?
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

    public int getAgeOfWine(){return calculateAgeOfWineInYears(birthOfWine);}
}
