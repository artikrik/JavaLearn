package com.company.W9.Countries;

public class Main {
    public static void main(String[] args) {

        CountryMap map=new CountryMap();

        map.addCountryInList("Brazilia", 40000000);
        map.addCountryInList("Croatia", 10000000);

        map.printInfoAboutCountries();

        map.searchInfoByCountry("Croatia");
    }
}
