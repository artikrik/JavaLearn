package w10;

public class MainMap {

    public static void main(String[] args) {

        CountryMap countryMap = new CountryMap();

        countryMap.addCountry(CountryMap.CountriesEnum.Ukraine,42000000);
        countryMap.addCountry(CountryMap.CountriesEnum.Russia,160000000);
        countryMap.addCountry(CountryMap.CountriesEnum.America,250000000);

        System.out.println(countryMap.toString());
        System.out.println("Population= "+ countryMap.searchCountryByName(CountryMap.CountriesEnum.Ukraine));
    }
}