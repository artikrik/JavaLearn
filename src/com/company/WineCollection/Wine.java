package com.company.WineCollection;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wine {
    private String wineName;
    private String wineCountry;
    private GregorianCalendar bottlingYear;

    public Wine(String wineName, String wineCountry, GregorianCalendar bottlingYear) {
        setWineName(wineName);
        setWineCountry(wineCountry);
        setBottlingYear(bottlingYear);
    }

    private void setWineName(String wineName) {
        this.wineName = wineName;
    }

    private void setWineCountry(String wineCountry) {
        this.wineCountry = wineCountry;
    }

    private void setBottlingYear(GregorianCalendar bottlingYear) {
        this.bottlingYear = bottlingYear;
    }

    public String getWineName() {
        return wineName;
    }

    public String getWineCountry() {
        return wineCountry;
    }

    public int wineAge() {
        return bottlingYear.get(Calendar.YEAR);
    }

    public int getWineAge() {
        return new GregorianCalendar().get(Calendar.YEAR) - wineAge();
    }

    @Override
    public String toString() {
        return "Wine{" +
                "Название: '" + wineName + '\'' +
                ", Страна: '" + wineCountry + '\'' +
                ", Урожай: " + wineAge() + " года" +
                '}';
    }
}
