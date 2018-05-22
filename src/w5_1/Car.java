package w5_1;

import static w5_1.Main.acceleration;

public class Car {

    public int yearModel;
    public String mark;
    public int speed;


    public Car(int yearModel, String mark) {
        setYearModel(yearModel);
        setMark(mark);
        acceleration(0);
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String toString() {
        return "Model year - " + yearModel + "\nMarke - " + mark + "\nSpeed - ";
    }
}
