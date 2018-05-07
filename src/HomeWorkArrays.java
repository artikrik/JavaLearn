import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkArrays {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
        /*int a=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0) {
                a++;
            }
        }
// Не проще будет а посчитать одним выражением?
        int[] Array = new int[a];
        for(int i=1,b=0;i<=99;i++){  // Цикл по значениям - не лучший выход. Хорошо когда их 99. А если 999999999? Лучше было бы цикл по элементам массива. 
            if(i%2!=0){
                Array[b]=i;
                System.out.print(Array[b]+" ");
                b++;
            }
        }

        System.out.println(" ");
        for(int i=Array.length-1;i>=0;i--){
            System.out.print(" " +Array[i]);
        }

        //ЗАДАНИЕ 2
        /*int[] n = new int[15];
        int s = 0;
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (-1 + 10 * Math.random()); // Math.random()) не включает 1. Вы генерируете случайтые числа от -1 до 8. Повезло!)))
            System.out.print(" " + n[i]);
            if ((n[i] % 2 == 0)){
                s++;
            }

        }
        System.out.println();
        System.out.println("Количество четных чисел в массиве: " + s);

        //ЗАДАНИЕ 3
        int[] n = new int[8];
        int s = 0;
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (1 + 10 * Math.random());
            System.out.print(" " + n[i]);
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 1) {
                n[i] = 0;

            }
            System.out.print(" " +n[i]);
        }
        //ЗАДАНИЕ 4
        int [] n = new int [5];
        int [] m = new int [5];
        double a = 0, b = 0;
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (1 + 5 * Math.random()); // Получится от 1 до 5
            System.out.print(n[i]+ " ");
            a+=(double)n[i]/n.length;

        }
        System.out.println(" ");
        System.out.println(a);

        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (1 + 5 * Math.random());
            System.out.print(m[i]+ " ");
            b+= (double)m[i]/m.length;

        }

        System.out.println(" ");
        if (a == b)
            System.out.println("Средние арифметические значения двух массивов равны");
        else {
            if (a > b)
                System.out.println("Среднее арифметическое значение первого массива больше");
            else
                System.out.println("Среднее арифметическое значение второго массива больше");
        }*/
        //ЗАДАНИЕ 5
        /*int n = 20;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2; // Замечательное решение! fib не нужно иннициализировать. Достаточно просто объявить. Лишние действия запутывают: зачем это сделано?
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i = i + 1;
        }

        int [] n = new int [20];
        for (int i = 0; i<n.length; i++){
            if(i<2){
                n[i] = 1;
                }
                else {
                n[i] = n[i-2] + n[i-1];
            }
            System.out.print(n[i]+ " ");
        }*/
        //ЗАДАНИЕ 6
        /*int[] n = new int[12];
        int maxIndex = 0; // Замечатено!!! Предлагаю рассказать эту идею всем ребятам!!! 
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) Math.round((Math.random() * 30) - 15); // Опять потеряли максимальное значение 15
            if( n[i] > n[maxIndex] ){
                maxIndex = i;

            }
            System.out.print(" " +n[i]);


        }
        System.out.println(" ");
        System.out.print("Максимальный индекс " + maxIndex);

        //ЗАДАНИЕ 7
        int[] n = new int[10];
        int[] m = new int[10];
        double[] v = new double[10];

        double a = 0, b = 0;
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (1 + 9 * Math.random());
            //System.out.print(n[i]+ " ");

        }
        System.out.println(" ");

        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (1 + 9 * Math.random()); // Тут все отлично! 1-9! Почему ранее были проблемы?
            //System.out.print(m[i]+ " ");
        }
        System.out.println(" ");

        for (int i = 0; i < v.length; i++) {
            v[i] = (double) n[i] / m[i];
            //System.out.print(v[i]+ " ");
        }

        int k = 0;
        for (int i = 0; i < v.length; i++)
            if (v[i] % 1 == 0) k++;
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(v));
        System.out.println("Целые числа третьего массива " + k);

        //ЗАДАНИЕ 8
        int NegativeNumbers = 0;
        int numberOfZeros = 0;
        int numberOfOnes = 0;
        int mas[] = new int[11];
        for (int i = 0; i < 11; i++) {
            mas[i] = (int) (Math.random() * 3) - 1;
            System.out.print(mas[i] + " ");
            if (mas[i] == -1)
                NegativeNumbers++;
            else if (mas[i] == 0)
                numberOfZeros++;
            else
                numberOfOnes++;
        }
        System.out.println();
        if ((NegativeNumbers > numberOfZeros && NegativeNumbers > numberOfOnes))
            System.out.println("отрицательные значения");
        else if ((numberOfZeros > NegativeNumbers && numberOfZeros > numberOfOnes))
            System.out.println("встречается чаще ноль");
        else
            System.out.println("встречается чаще еденица");

        */
        //ЗАДАНИЕ 9


        int a;
        int leftSide = 0;
        int rightSide = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("Ввести число");

        if (scn.hasNextInt()) {

            do {
                a = scn.nextInt();
                if (a % 2 != 0 || a < 1) System.out.println("Число не верно");
            }
            while (a % 2 != 0 || a < 1);

            int[] array = new int[a];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 11) - 5;
                System.out.print(array[i] + " ");

                if (i <= array.length / 2 - 1) {
                    leftSide += Math.abs(array[i]);
                } else {
                    rightSide += Math.abs(array[i]);
                }

                if (i == array.length - 1) {
                    System.out.println(" ");
                    if (leftSide > rightSide)
                        System.out.println("Сумма первой половины больше и равна " + leftSide);
                    if (rightSide > leftSide)
                        System.out.println("Сумма  второй половины  больше и равна " + rightSide);
                    if (rightSide == leftSide)
                        System.out.println("Суммы первой и второй половины равны");
                }
            }
        } else System.out.println("Введено не число");
    }
}
