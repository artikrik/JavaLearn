package w6Comparable;


class Runner implements Comparable<Runner> {

    private String name;
    private String country;
    private int time;

    public Runner(String name, String country, int time) {
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

    public int compareTo(Runner o) {
        if (getName().compareTo(o.getName()) != 0)
            return getName().compareTo(o.getName());
        else
            return getTime() - o.getTime();
    }

    @Override
    public String toString() {
        return "Марафонцы{" +
                "Страна='" + country + '\'' +
                ", Имя='" + name + '\'' +
                ", Время=" + time +
                '}';
    }
}

