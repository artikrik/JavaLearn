package w9_Countries;

public enum Countries {

    UGANDA(100000), USA(500000), UKRAINE(400000), TURKEY(3000);

    private long numberOfPopulation;

    Countries(long numberOfPopulation) {
        this.numberOfPopulation = numberOfPopulation;
    }

    public long getNumberOfPopulation() {
        return numberOfPopulation;
    }
}
