package w3;
import java.util.Scanner;

public class LenearSearchString {
    public static void main(String[] args) {
        int i, num;
        String item;
        String array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        num = input.nextInt();


        array = new String[num];

        System.out.println("Введите " + num + " строк");


        for (i = 0; i < num; i++) {
            array[i] = input.next();
        }
        System.out.println("Введите строку, которую надо найти: ");
        item = input.next();

        for (i = 0; i < num; i++) {
            if (array[i].equals(item)) {
                System.out.println(item + " является " + (i+1) + " по счету в массиве");
                break;
            }
        }
        if (i == num) {
            System.out.println("Строка " + item + " не найдена в массиве");
        }

    }
}