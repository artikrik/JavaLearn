package w2;
        /*3.Создайте массив из 8 случайных целых чисел из отрезка [1;10].
        Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль.
        Снова выведете массив на экран на отдельной строке.*/

public class Task_3 {
    public static void main(String[] args) {
        int[] mass;
        mass = new int[8];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ( 1+10*Math.random());
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {               //определяем не четные индексы
                mass[i] = 0;                //и заменяем их значения на "0"
            }
            System.out.print(mass[i] + " ");
        }

    }
}
