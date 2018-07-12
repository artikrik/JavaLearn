package w10;

import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    public enum CountriesEnum {

        Ukraine, Russia, America;
    }

    private Map<CountriesEnum, Integer> country = new HashMap<>();

    public void addCountry(CountriesEnum countriesEnum, int population) {
        country.put(countriesEnum, population);
    }

    public int searchCountryByName(CountriesEnum countriesEnum) {
        return country.get(countriesEnum);
    }

    @Override
    public String toString() {
        return country.toString();
    }
}