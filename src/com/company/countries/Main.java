package com.company.countries;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        CountriesMap map;
        map = addCountries();
        map.printCountries();

        Scanner s = new Scanner(System.in);
        String input;

        do {
            System.out.println("\nEnter country input you want to find: ");
            input = s.next();
            try {
                System.out.println(map.findCountry(input).toString());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("\nDo you want to continue search ? Press Y or N");
            input = s.next();
            if (input.equals("N")) break;
        }
        while (true);
    }

    public static CountriesMap addCountries() {
        CountriesMap map = new CountriesMap();
        map.addCountry(new Country("Andorra", 11111111111L));
        map.addCountry(new Country("Ukraine", 22222222L));
        map.addCountry(new Country("USA", 333333333L));
        map.addCountry(new Country("Spain", 55555L));
        map.addCountry(new Country("Ukraine", 999999999L));
        return map;
    }
}
