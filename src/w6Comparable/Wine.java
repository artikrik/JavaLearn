package w6Comparable;

class Wine implements Comparable<Wine> {
    public String country;
    public String name;
    public int ageOfWine;

    public Wine(String country, String name, int ageOfWine) {
        this.country = country;
        this.name = name;
        this.ageOfWine = ageOfWine;
    }

    @Override

    public int compareTo(Wine o)
    {return this.ageOfWine - o.ageOfWine;
    }

    @Override
public String toString() {
    return "Wine{" +
            "country='" + country + '\'' +
            ", name='" + name + '\'' +
            ", ageOfWine=" + ageOfWine +
            '}';
}
}