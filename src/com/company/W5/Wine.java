package com.company.W5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wine {

    private String name;
    private String country;
    GregorianCalendar dateRozlivu;
    private int rikRozlivu;

    public Wine(String name, String country, GregorianCalendar dateRozlivu) {
        setName(name);
        setCountry(country);
        setDateRozlivu(dateRozlivu);
    }

    public int vytrymka() {
        LocalDate localDate = LocalDate.now();
        int localD = localDate.getYear();
        int vytrymkaV = localD - rikRozlivu;
        if (vytrymkaV > 0) {
            return vytrymkaV;
        } else return 0;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateRozlivu(GregorianCalendar dateRozlivu) {
        this.dateRozlivu = dateRozlivu;
        rikRozlivu = dateRozlivu.get(Calendar.YEAR);
    }


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getDateRozlivu() {
        return rikRozlivu;
    }
}

// для себе

//  DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDate);

//  DateTimeFormatter locDate = DateTimeFormatter.ofPattern("yyyy, MM, dd");
// (localDate.format(locDate))