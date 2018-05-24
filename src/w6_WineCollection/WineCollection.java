package w6_WineCollection;

import java.util.GregorianCalendar;

public class WineCollection {
    private String name;
    private String country;
    private GregorianCalendar dateOfBottling;

    public WineCollection(String name, String country, GregorianCalendar dateOfBottling) {
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

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public GregorianCalendar getDateOfBottling() {
        return dateOfBottling;
    }

    public int wineExtract() {
        return new GregorianCalendar().get(GregorianCalendar.YEAR) - dateOfBottling.get(GregorianCalendar.YEAR);
    }

    public String toString() {
        return "\nName - " + name + "\nCountry -  " + country + "\nWine extract " + wineExtract() + " years" + "\n";
    }


}



