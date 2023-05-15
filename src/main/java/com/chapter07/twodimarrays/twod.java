package com.chapter07.twodimarrays;

public class twod {
    int [][]arr= new int[5][10];



    public void fillArr(){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = i*j*10+15;
            }
        }
    }

    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("the value of Arr[%03d][%03d] : ",i,j);
                System.out.print(arr[i][j] +"\t\t\t");

            }
            System.out.println();
        }
    }
}
