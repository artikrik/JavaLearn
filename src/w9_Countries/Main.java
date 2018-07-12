package w9_Countries;


public class Main {
    public static void main(String[] args) {

        Countries Uganda = new Countries("Uganda");
        Countries USA = new Countries("Usa");
        Countries Ukraine = new Countries("Ukraine");
        Countries Japan = new Countries("Japan");


        CountriesList countriesList = new CountriesList();
        countriesList.put(Uganda,100000);
        countriesList.put(USA,500000);
        countriesList.put(Ukraine,450000);
        countriesList.put(Japan,900000);

        countriesList.showListOfCountries();
        countriesList.showListOfPopulation();
    }
}
