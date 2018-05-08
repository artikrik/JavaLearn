package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * Math.random());
            System.out.print(" " + array[i]);
        }
        System.out.println("");

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int c;
                    c=array[j];
                    array[j]=array[j+1];
                    array[j+1]=c;
                }
            }
        }


        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}


