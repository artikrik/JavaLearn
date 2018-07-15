package com.company.w10;

public class Main {
    public static void main(String[] args) {
        CountriesMap map;
        map = new CountriesMap();
        map.addCountry(new Countries("Germany", 82800000L));
        map.addCountry(new Countries("Italy", 60589445L));
        map.addCountry(new Countries("Ukraine", 42482000L));
        map.addCountry(new Countries("France", 67024459L));

        map.print();

        try {
            System.out.println(map.searchByKey("Italy"));
            System.out.println(map.searchByKey("Germany"));
            System.out.println(map.searchByKey("France"));
            System.out.println(map.searchByKey("Ukraine"));
            System.out.println(map.searchByKey("Vin"));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
