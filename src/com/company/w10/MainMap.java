package w10;

import java.util.HashMap;
import java.util.Map;

public class MainMap {


    public static void main(String[] args) {

        Map<String, Integer> country = new HashMap<>();
        country.put("Украина", 42000000);
        country.put("Россия", 160000000);
        country.put("Америка", 250000000);

        System.out.println(country.toString());
        System.out.println(country.get("Украина"));
    }
}

