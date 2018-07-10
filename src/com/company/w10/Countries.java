package w10;

import java.util.Map;

public enum Countries {

    Ukraine("Ukraine", 42000000), Russia("Russia", 160000000), America("America", 250000000);

    private String name;
    private int population;

    Countries(String name, int population) {
        this.population = population;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}