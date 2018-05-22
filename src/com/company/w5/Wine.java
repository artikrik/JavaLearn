package w5;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        return new GregorianCalendar().get(Calendar.YEAR) - yearOfHarvest.get(Calendar.YEAR);
    }

    public String getName() {
        return name;
    }

    public String getCountryName() {
        return countryName;
    }
}

