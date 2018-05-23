package w5_1;

public class Car {

    private int yearModel;
    private String mark;
    private int speed;


    public Car(int yearModel, String mark) {
        setYearModel(yearModel);
        setMark(mark);
        setSpeed(0);
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSpeed (int speed){
        this.speed = speed;
    }

    public int getYearModel (){
        return yearModel;
    }

    public String getMark(){
        return mark;
    }

    public int getSpeed(){
        return speed;
    }

    public int carAcceleration() {
        return speed += 5 ;
    }

    public int carBraking() {
        return speed -= 5;
    }

    /*public String toString() {
        return "Model year - " + yearModel + "\nMarke - " + mark + "\nSpeed - ";
    }*/
}
