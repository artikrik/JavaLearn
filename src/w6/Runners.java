package w6;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Runners {

    private String name;
    private String country;
    private LocalTime runTime;

    public Runners(String name, String country, LocalTime runTime) {
        this.name = name;
        this.country = country;
        this.runTime = runTime;

    }

    long winningTime() {
        return ChronoUnit.SECONDS.between(LocalDateTime.now().toLocalTime(), runTime);
    }

    public String toString() {
        return "Имя - " + name + "Страна -  " + country + "Время " + winningTime() + "  ";
    }
}