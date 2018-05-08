package w2;
        /*7.Создайте два массива из 10 целых случайных чисел из отрезка [1;9]
        и третий массив из 10 действительных чисел.
        Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива
        с i-ым индексом к элементу из второго массива с i-ым индексом.
        Вывести все три массива на экран (каждый на отдельной строке),
        затем вывести количество целых элементов в третьем массиве.*/

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int dlina = 10;
        int[] mass0 = new int[dlina];
        int[] mass1 = new int[dlina];
        double[] mass2 = new double[dlina];
        int wholeDigit = 0;
        for (int i = 0; i < dlina; i++) {

            mass0[i] = (int) (1 + 10 * Math.random());
            mass1[i] = (int) (1 + 10 * Math.random());
            mass2[i] = (double) mass0[i] / mass1[i];              //инициализируем элементы третьего массива

            if (mass2[i] % (int) mass2[i] == 0) {                //ищим целые числа в третьем массиве
                wholeDigit++;
            }
        }
        System.out.print("\n first mass" + Arrays.toString(mass0) + " ");
        System.out.print("\n second mass" + Arrays.toString(mass1) + " ");
        System.out.print("\n third mass" + Arrays.toString(mass2) + " ");
        System.out.print("\n wholeDigit in third mass = " + wholeDigit);
    }
}