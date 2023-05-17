package com.chapter07.exercise;

import java.util.Scanner;

public class ex1 {
    private final static int  ARRAY_SIZE = 10;
    private final static int  BASIC_SALARY = 200;

    private static int []salaries = new int [ARRAY_SIZE]; 

    private int getComission(int sale){
        double comission = sale * 0.09;
        return (int)comission;
    }
    private int[] getSalaries(){
        int[]sales = {300,250,1000,213,6419,5000,423,489,6547,23500};
        for (int j = 0; j < salaries.length; j++) {
            salaries[j] = BASIC_SALARY + getComission(sales[j]);
            System.out.println(salaries[j]);
        }
        return salaries;
    }


    private int[] getFrequency(){
        int[]frequency = new int [11];
        int []salaries1 = getSalaries();
        for (int i = 0; i < frequency.length-1; i++) {
            int salary = salaries1[i];
            if (salary > 1000)
                ++frequency[10];
            else
                ++frequency[salaries1[i]/100];
        }
        return frequency;
    }

    public void outputChart(){
        int[]frequency = getFrequency();

        for (int i = 2; i < frequency.length; i++) {
            if (i == 10)
                System.out.printf("$%5d and over : ",1000);
            else 
                System.out.printf("$%3d-%3d : ",i*100,i*100+99);
            for (int j = 0; j < frequency[i]; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
