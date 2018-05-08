package w2;
        /*6.Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.*/

public class Task_6 {
    public static void main(String[] args) {
        int[] mass;
        mass = new int[12];
        int max = mass[0];                            //минимальный элемент массива
        int indexOfMaxElement = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (-15 + 30 * Math.random());
            if (max <= mass[i]) {
                max = mass[i];
                indexOfMaxElement = i;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n Max element is" + " " + max);
        System.out.println("\n indexOfMaxElement" + " " + indexOfMaxElement);
    }
}
