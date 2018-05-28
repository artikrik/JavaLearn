package com.company.w5;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private static LocalDate currentDate;  // Вычисляемое данное. Стоит ли его хранить?
    private String name;
    private String country;
    private LocalDate birthOfWine;

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", birthOfWine=" + birthOfWine +
                ", currentDate=" + currentDate +
                '}';
    }

    public Wine(String name, String country, LocalDate birthOfWine) {
        this.name = name; // Вы сделали сеттеры для иннициализации полей. пользуйтесь ими и не дублируйте код: setName(name);
        this.country = country;  //  setCountry(country);
        this.birthOfWine = birthOfWine;  // setBirthOfWine(birthOfWine);
        currentDate = LocalDate.now();  // Если программа будет работать несколько дней - кто и как должен обновлять это поле?
    }


    public int calculateAgeInYears(LocalDate birthDate, LocalDate currentDate) {  // не понятно, что делает метод? Вычисляет разность выдержек между двумя винами? или свой возраст?
        if ((birthDate != null) && (currentDate != null)) {  // birthDate и currentDate это поля или параметры? 
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
}
