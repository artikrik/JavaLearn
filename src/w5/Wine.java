package w5;

import java.util.GregorianCalendar;

public class Wine {
    private String name;
    private String country;
    private GregorianCalendar dateOfBottling;
    GregorianCalendar gregorianCalendar = new GregorianCalendar();

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
        return new GregorianCalendar().get(GregorianCalendar.YEAR) - dateOfBottling.get(GregorianCalendar.YEAR);
    }

    public String toString() {
        return "Name - " + name + "\nCountry -  " + country + "\nWine extract " + wineExtract() + " years";
    }


}
