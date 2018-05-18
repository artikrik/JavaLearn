package com.company.w5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BottleOfWine {
    private String name;
    private String country;
    private String sweetnessOfWine;
    private int year;
    private double bottleCapacity;

    public BottleOfWine(String name, String country, String sweetnessOfWine, int year, double bottleCapacity) {
        setCountry(country);
        setName(name);
        setSweetnessOfWine(sweetnessOfWine);
        setYear(year);
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getBottleCapacity() {
        return bottleCapacity;
    }

    public void setBottleCapacity(double bottleCapacity) {
        this.bottleCapacity = bottleCapacity;
    }

    public int dateOfEndurance() {
        GregorianCalendar currentYear = new GregorianCalendar();
        return new GregorianCalendar().get(Calendar.YEAR) - year;
    }

}
