package com.company.w6.WineCollectionComparable;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wine implements Comparable<Wine> {
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

    public String getSweetnessOfWine() {
        return sweetnessOfWine;
    }

    public void setSweetnessOfWine(String sweetnessOfWine) {
        this.sweetnessOfWine = sweetnessOfWine;
    }

    public GregorianCalendar getDateOfEndurance() {
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
        return name;
    }

    public int compareTo(Wine wine) {
        if (this.periodOfWineHolding() > wine.periodOfWineHolding()) return 1;
        else if (this.periodOfWineHolding() < wine.periodOfWineHolding()) return -1;
        else return 0;
    }
}
