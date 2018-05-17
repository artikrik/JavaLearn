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

public class WineCatalog {

    public static void main(String[] args) {

        Wine drink1 = new Wine();
        drink1.setName("Shabodun");
        drink1.setCountry("France");
        drink1.setYearOfBottling(2000);
        drink1.getWineExtract();

        Wine drink2 = new Wine();
        drink2.setName("Bulbon");
        drink2.setCountry("Greece");
        drink2.setYearOfBottling(1985);
        drink2.getWineExtract();

        Wine drink3 = new Wine();
        drink3.setName("Cruton");
        drink3.setCountry("Crimea");
        drink3.setYearOfBottling(2010);
        drink3.getWineExtract();

        System.out.println(
                "Name- " + drink1.setName("Shabodun") + "\nCountry- " + drink1.setCountry("France") + "\nYear of Bottling- " + drink1.setYearOfBottling(2000)
                        + "\nWine extract- " + drink1.getWineExtract() + " years");
    }
}