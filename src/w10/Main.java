package w10;

public class Main {
    public static void main(String[] args) {
        CountriesMap map = new CountriesMap();
        map.addCountry(new Country("Germany", 82800000L));
        map.addCountry(new Country("China", 10000));


        map.print();
        System.out.println(map.searchByKey("Japan"));
        System.out.println(map.searchByKey("China"));

    }
}


