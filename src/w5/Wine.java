package w5;


import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;


public class Wine {
    private String name;
    private String country;
    private GregorianCalendar dateOfBottling;

    public Wine(String name, String country, GregorianCalendar dateOfBottling) {
        setName(name);
        setCountry(country);
        setDateOfBottling(dateOfBottling);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateOfBottling(GregorianCalendar dateOfBottling) {
        this.dateOfBottling = dateOfBottling;
    }

    public int wineExtract() {
        return dateOfBottling.get(Calendar.DATE) - new GregorianCalendar().get(DATE);
    }


    public String toString() {
        return "Name - " + name + "\nCountry -  " + country + "\nWine extract " + wineExtract() + " years";
    }


}
