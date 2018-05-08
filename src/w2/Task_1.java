package w2;
        /*1.Создайте массив из всех нечётных чисел от 1 до 99,
        выведите его на экран в строку,
        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).*/

public class Task_1 {
    public static void main(String[] args) {

        int[] mass;
        mass = new int[50];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * 2 + 1;
            System.out.print(mass[i] + " ");
        }

        System.out.println("");
        for (int i = mass.length-1; i >= 0; i--) {
            mass[i] = i * 2+1;
            System.out.print(mass[i] + " ");
        }
    }
}