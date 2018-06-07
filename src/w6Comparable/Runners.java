package w6Comparable;


class Runners implements Comparable<Runners> {

    private String name;
    private String country;
    private int time;

    public Runners(String name, String country, int time) {
        this.name = name;
        this.country = country;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getTime() {
        return time;
    }

    @Override

    public int compareTo(Runners o) {
        if (getName().compareTo(o.getName()) != 0)
            return getName().compareTo(o.getName());
        else
            return getTime() - o.getTime();
    }

    @Override
    public String toString() {
        return "Марафонцы{" +
                "Country='" + country + '\'' +
                ", Name='" + name + '\'' +
                ", Time=" + time +
                '}';
    }
}

