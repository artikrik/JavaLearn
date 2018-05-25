package w2;

public class Task1 {
    public static void main(String[] args) {

        int[] array;
        array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}


