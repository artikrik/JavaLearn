package w6_Marathone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;

public class MarathonRunner {

    private String name;
    private String nationality;
    private int age;
    private String time;

    public MarathonRunner(String name, String nationality, int age) {
        setName(name);
        setAge(age);
        setNationality(nationality);
        setTime(Time());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getTime() {
        return time;
    }

    public String Time() {
        long millis;
        millis = (long) (600000 * Math.random());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        SimpleDateFormat format = new SimpleDateFormat("mm:ss");
        return format.format(calendar.getTime());
    }
    public static Comparator<MarathonRunner> FinishTime = new Comparator<MarathonRunner>(){

        public int compare(MarathonRunner m1, MarathonRunner m2) {
            String marathoner1 = m1.getTime().toUpperCase();
            String marathoner2 = m2.getTime().toUpperCase();
            return marathoner1.compareTo(marathoner2);
        }
    };

        public String toString() {
            return "\nName - " + name + "\nNationality -  " + nationality + "\nAge " + age + "\nTime " + time + "\n";
        }
    }