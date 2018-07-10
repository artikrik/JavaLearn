package w10;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Countries russia = Countries.Russia;
        Countries america = Countries.America;
        Countries ukraine = Countries.Ukraine;

        Map<String, Integer> country = new HashMap<>();
        country.put(ukraine.getName(),ukraine.getPopulation());
        country.put(russia.getName(),russia.getPopulation());
        country.put(america.getName(),america.getPopulation());

        System.out.println(country.toString());

        System.out.println("Population of " + ukraine.getName() +  " = " + country.get(ukraine.getName()));
    }
}