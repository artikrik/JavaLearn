package com.company.Countries;

public class Main {

    public static void main(String[] args) {
        CountriesMap map = new CountriesMap();

        map.addCountry(new Countries("Ukraine", (long) 45000000));
        map.addCountry(new Countries("Moldova", (long) 3552000));
        map.addCountry(new Countries("Germany", (long) 82670000));
        map.addCountry(new Countries("Russia", (long) 144300000));

        map.print();

        System.out.println(map.search("Ukraine"));
        System.out.println(map.search("Moldova"));
        System.out.println(map.search("Germany"));
        System.out.println(map.search("Russia"));
    }

}
