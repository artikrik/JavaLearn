/*
Задача Wine.
        Опишите класс Wine , который в дальнейшем может быть применим при создании электронного каталога вин
        (сам электронный каталог вин реализовывать не нужно).
        Продумайте, какие поля и методы понадобятся классу Wine, для выполнения следующих функций:
        1. Хранение информации о виде вина: название, страна, дата разлива.
        2. Доступ (установка и получение значений) к хранимой информации.
        3. Расчёт выдержки вина в годах (текущая дата задаётся как параметр или определяется системной датой).
*/

package w5;

import java.util.GregorianCalendar;

import com.sun.org.apache.xpath.internal.operations.String;

public class Main {

    public static void main(String[] args) {

        Wine wine1 = new Wine();
        wine1.setName ("Swabo");

        Wine wine2 = new Wine();

        Wine wine3 = new Wine();

        System.out.println(wine1);
    }
}