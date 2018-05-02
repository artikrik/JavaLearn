import java.util.Random;
import java.util.Arrays;

public class HomeWorkArrays {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
       /*int a[] = new int[100];

        for (int i = 0; i < a.length-1; i++) {
            if (i % 2 == 1)
                System.out.print(" " + i);
        }
        System.out.println();

        int b[] = new int[100];

        for (int i = a.length - 1; i > -1 ; i--) {
            if (i % 2 == 1)
                System.out.print(" " + i);
        }

        //ЗАДАНИЕ 2
        /*int[] n = new int[15];
        int s = 0;
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (-1 + 10 * Math.random());
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
            n[i] = (int) (1 + 5 * Math.random());
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
        int fib = 2, i = 2;
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
        int maxIndex = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) Math.round((Math.random() * 30) - 15);
            if( n[i] > n[maxIndex] ){
                maxIndex = i;

            }
            System.out.print(" " +n[i]);


        }
        System.out.println(" ");
        System.out.print("Максимальный индекс " + maxIndex);
        */
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
            m[i] = (int) (1 + 9 * Math.random());
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


    }
}
