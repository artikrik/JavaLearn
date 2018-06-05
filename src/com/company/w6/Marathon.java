package w6;

public class Marathon implements Comparable<Marathon> {
    private String name;
    private int finishTime;

    public Marathon(String name, int finishTime) {
        setName(name);
        setFinishTime(finishTime);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Marathon o) {
        if (getName().compareTo(o.getName()) != 0)
            return getName().compareTo(o.getName());
        else
            return getFinishTime() - o.getFinishTime();
    }

    @Override
    public String toString() {
        return "Marathon{" +
                "name='" + name + '\'' +
                ", time=" + finishTime + " min" +
                '}';
    }
}

