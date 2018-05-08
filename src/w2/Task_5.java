package w2;
        /*5.Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.*/

public class Task_5 {
    public static void main(String[] args) {
        int length = 22;
        int[] mass = new int[length];
        mass[0] = 0;
        mass[1] = 1;
        for (int i = 2; i < length; i++) {
            mass[i] = mass[i - 1] + mass[i - 2];
            System.out.print(mass[i] + " ");
        }
    }
}
