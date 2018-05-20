package com.company.w5;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BottleOfWine {
    private String name;
    private String country;
    private String sweetnessOfWine;
    private String dateOfEndurance;
    private double bottleCapacity;

    public BottleOfWine(String name, String country, String sweetnessOfWine, String dateOfEndurance, double bottleCapacity) {
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

    public void setDateOfEndurance(String dateOfEndurance) {
        this.dateOfEndurance = dateOfEndurance;
    }

    public double getBottleCapacity() {
        return bottleCapacity;
    }

    public void setBottleCapacity(double bottleCapacity) {
        this.bottleCapacity = bottleCapacity;
    }

    public long dateOfEndurance() throws Exception {
        if (dateOfEndurance.isEmpty()) throw new Exception("Не указана дата розлива вина");
        Calendar dateBirthOfWine = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = sdf.parse(dateOfEndurance);
            dateBirthOfWine.setTime(date);
        } catch (Exception e) {
            System.out.println("Correct data format: \"dd.MM.yyyy\"");
            throw new Exception(e.getMessage());
        }
        return new GregorianCalendar().get(Calendar.YEAR) - dateBirthOfWine.get(Calendar.YEAR);
    }
}
