package com.company.w6;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wine {
    private String name;
    private String country;
    private String sweetnessOfWine;
    private GregorianCalendar dateOfEndurance;
    private double bottleCapacity;

    public Wine(String name, String country, String sweetnessOfWine, GregorianCalendar dateOfEndurance, double bottleCapacity) {
        setCountry(country);
        setName(name);
        setSweetnessOfWine(sweetnessOfWine);
        setDateOfEndurance(dateOfEndurance);
        setBottleCapacity(bottleCapacity);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSweetnessOfWine() {
        return sweetnessOfWine;
    }

    public void setSweetnessOfWine(String sweetnessOfWine) {
        this.sweetnessOfWine = sweetnessOfWine;
    }

    public Serializable getDateOfEndurance() {
        return dateOfEndurance;
    }

    public void setDateOfEndurance(GregorianCalendar dateOfEndurance) {
        this.dateOfEndurance = dateOfEndurance;
    }

    public double getBottleCapacity() {
        return bottleCapacity;
    }

    public void setBottleCapacity(double bottleCapacity) {
        this.bottleCapacity = bottleCapacity;
    }

    public long periodOfWineHolding() {
        return new GregorianCalendar().get(Calendar.YEAR) - dateOfEndurance.get(Calendar.YEAR);
    }



    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", sweetnessOfWine='" + sweetnessOfWine + '\'' +
                ", dateOfEndurance=" + dateOfEndurance.get(Calendar.YEAR) +
                ", bottleCapacity=" + bottleCapacity +
                '}';
    }
}
