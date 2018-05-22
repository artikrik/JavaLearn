package com.company.W5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wine {

    private String name;
    private String country;
    GregorianCalendar dateBottling;


    public Wine(String name, String country, GregorianCalendar dateBottling) {
        setName(name);
        setCountry(country);
        setdateBottling(dateBottling);
    }

    public int endurance() {
        int enduranceV = LocalDate.now().getYear() - dateBottling.get(Calendar.YEAR);
        if (enduranceV > 0) {
            return enduranceV;
        } else return 0;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setdateBottling(GregorianCalendar dateBottling) {
        this.dateBottling = dateBottling;

    }


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYearBottling(){
        return dateBottling.get(Calendar.YEAR);
    }

}

// для себе

//  DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDate);

//  DateTimeFormatter locDate = DateTimeFormatter.ofPattern("yyyy, MM, dd");
// (localDate.format(locDate))
