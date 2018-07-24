package com.company.Countries;

public class Main {

    public static void main(String[] args) {
        CountriesMap map = new CountriesMap();

        map.addCountry(new Countries("Ukraine", 45000000l));
        map.addCountry(new Countries("Moldova", 3552000l));
        map.addCountry(new Countries("Germany", 82670000l));
        map.addCountry(new Countries("Russia", 144300000l));

        map.print();

        System.out.println("популяция Украины: " + map.search("Ukraine"));
        System.out.println("популяция Украины: " + map.search("Moldova"));
        System.out.println("популяция Украины: " + map.search("Germany"));
        System.out.println("популяция Украины: " + map.search("Russia"));
    }

}
