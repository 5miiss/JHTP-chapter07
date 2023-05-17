package com.chapter07.ArraysManipulation;

public class Table {
    final int ARRAY_SIZE = 3;
    int [][]arr = new int[ARRAY_SIZE][ARRAY_SIZE];

    public void init(){
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                arr[x][y] = x + y;
            }
        }
        printArr();
    }

    public void printArr(){
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.printf("the current index is [%d][%d] : equals to %d",x,y,arr[x][y]);
                System.out.println();

            }
            System.out.println();
        }
    }
}
