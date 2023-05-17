package com.chapter07.ArraysManipulation;

public class ArrayCpy {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8,9,10};
        int []b = {10,20,30,40,50,60,70,80,90,100};
        printArr(a);
        System.out.println();
        printArr(b);
        System.out.println();

        System.arraycopy(b, 5, a, 0, 3);

        printArr(a);
        System.out.println();

        printArr(b);


    }
    public static void printArr(Object o){
        if (o instanceof int[]){
            int []array = (int[]) o;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] +" ");
            }
        }

        if (o instanceof double[]){
            double []array = (double[]) o;
            for(double d: array)
                System.out.println(d);
        }
    }
}
