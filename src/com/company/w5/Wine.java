package w5;

import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Wine {
    private String name;
    private String countryName;
    GregorianCalendar yearOfHarvest;


    public Wine(String name, String countryName, GregorianCalendar yearOfHarvest) {
        setName(name);
        setCountryName(countryName);
        setDate(yearOfHarvest);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setDate(GregorianCalendar yearOfHarvest) {
        this.yearOfHarvest = yearOfHarvest;
    }

    public int getWineAge() {
        return new GregorianCalendar().get(Calendar.YEAR) - wineAge();
    }

    public int wineAge() {
        return yearOfHarvest.get(Calendar.YEAR);
    }

    public String getName() {
        return name;
    }

    public String getCountryName() {
        return countryName;
    }
    @Override
    public String toString() {
        return "Wine{" +
                "Название: '" + name + '\'' +
                ", Страна: '" + countryName + '\'' +
                ", Урожай: " + wineAge() + " года" +
                '}';
    }
}

