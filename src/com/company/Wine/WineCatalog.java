package com.company.Wine;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WineCatalog {
    private String wineName;
    private String wineCountry;
    private GregorianCalendar bottlingYear;

    public WineCatalog(String wineName, String wineCountry,
                       GregorianCalendar bottlingYear){
        setWineName(wineName);
        setWineCountry(wineCountry);
        setBottlingYear(bottlingYear);
    }


    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public void setWineCountry(String wineCountry) {
        this.wineCountry = wineCountry;
    }

    public void setBottlingYear(GregorianCalendar bottlingYear) {
        this.bottlingYear = bottlingYear;
    }

    public String getWineName() {
        return wineName;
    }

    public String getWineCountry() {
        return wineCountry;
    }

    public int getBottlingYear() {
        return new GregorianCalendar().get(Calendar.YEAR) - bottlingYear.get(Calendar.YEAR);
    }
}
