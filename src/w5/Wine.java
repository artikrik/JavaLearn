package w5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Wine {
    private String name;
    private String country;
    private LocalDate localDate;


    public Wine(String name, String country, LocalDate localDate) {
        this.name = name;
        this.country = country;
        this.localDate = localDate;
    }

    long wineExtract() {
        return ChronoUnit.YEARS.between(localDate, LocalDate.now());
    }

    public String toString() {
        return "Имя - " + name + "\nСтрана -  " + country + "\nВыдержка " + wineExtract() + " лет";
    }


}