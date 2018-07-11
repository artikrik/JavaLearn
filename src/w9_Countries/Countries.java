package w9_Countries;

public enum Countries {

    UGANDA(100000), HERASIMA(500000), VINNITCA(400000), TYUTKI(3000);

    private long numberOfPopulation;

    Countries(long numberOfPopulation) {
        this.numberOfPopulation = numberOfPopulation;
    }

    public long getNumberOfPopulation() {
        return numberOfPopulation;
    }

}
