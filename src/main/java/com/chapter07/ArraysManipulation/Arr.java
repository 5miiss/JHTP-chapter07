package com.chapter07.ArraysManipulation;

public class Arr {
    int ARRAY_SIZE = 10;
    double []fractions = new double[ARRAY_SIZE];

    public void foo(){
        System.out.println(fractions[3]);
        fractions[8] = 1.667;
        fractions[5] = 3.333;
        printArr();
        System.out.println(sum());
    }

    public double sum(){
        double sum = 0;
        for (double d: fractions){
            sum += d;
        }
        return sum;
    }

    
    public double sumWithNorm(){
        double sum = 0;
        int x =0;
        for (; x < fractions.length; x++) {
            sum += fractions[x];
        }
        return sum;
    }
    public void printArr(){
        int i = 1;
        for (double d : fractions) {
            System.out.printf("the current elemnt of arr is %d\t", i++);
            System.out.println(d);
        }
    }
}
