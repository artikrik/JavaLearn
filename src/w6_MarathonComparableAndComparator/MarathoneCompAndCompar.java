package w6_MarathonComparableAndComparator;


public class MarathoneCompAndCompar implements Comparable<MarathoneCompAndCompar> {
    private String name;
    private int time;

    public MarathoneCompAndCompar(String name, int time) {
        setName(name);
        setTime(time);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public String toString() {
        return "\nName - " + getName() + "\nTime " + getTime();
    }

    @Override
    public int compareTo(MarathoneCompAndCompar m) {
        if (this.getName().compareTo(m.getName()) != 0)
            return this.getName().compareTo(m.getName());
        else return this.getTime() - m.getTime(); // return this.getTime() - m.getTime();
    }
}
