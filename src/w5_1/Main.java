/*
Напишите класс Car, который содержит следующие поля:
        1.	Поле yearModel предназначено для хранения года изготовления автомобиля
        2.	Поле make ссылается на объект String и предназначено для хранения марки автомобиля
        3.	Поле speed - это целое число, предназначенное для хранения текущей скорости автомобиля
        Кроме того, класс должен иметь следующий конструктор и другие методы:
        1.	Конструктор. Конструктор должен принять через параметр год изготовления и модель автомобиля для инициализации полей yearModel и make. Конструктор
        также должен присвоить 0 полю speed.
        2.	Соответствующие методы доступа, позволяющие получать значення полей yearModel, make и speed.
        3.	Ускорение. Метод ускорения должен добавлять 5 к полю скорости при каждом его вызове.
        4.	Торможение. Метод торможения должен вычитать 5 из поля скорости каждый раз, когда он вызывается.
        Продемонстрируйте использование класса в программе, которая создает объект Car, а затем пять раз вызовет метод ускорения. После каждого вызова метода
         ускорения выведите на экран текущую скорость автомобиля. Затем вызовите метод торможения пять раз. После каждого вызова метода торможения выведите
         текущую скорость автомобиля на экран.
*/

package w5_1;

public class Main {
    public static void main(String[] args) {


        Car car = new Car(2000, "BMV");
        int carAcceleration;
        int carBraking;
        for (int i = 0; i < 5; i++) {
            car.speed = acceleration(car.speed);
            carAcceleration = car.speed;
            System.out.print(carAcceleration + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            car.speed = carBraking(car.speed);
            carBraking = car.speed;
            System.out.print(carBraking + " ");
        }
    }

    public static int acceleration(int carAcceleration) {
        return carAcceleration += 5;
    }

    public static int carBraking(int carBraking) {
        return carBraking -= 5;
    }
}