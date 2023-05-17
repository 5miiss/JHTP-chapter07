package com.chapter07.exercise;

import java.util.Scanner;

public class ex2 {
    int []original = new int [5];
    int []printed = new int [5];


    public void initoriginal(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < original.length; i++) {
            System.out.println("enter values between 10 and 100");
            int x = sc.nextInt();
            if (x < 10 || x > 100)
                continue;
            original[i] = x;
            if (i == 0){
                System.out.println(original[i]);
                 printed[i] = x;
            }
            if (checkNotDup(x, printed)){
                System.out.println(original[i]);
                printed[i] = x;
            }
         
        }
        sc.close();
    }

    public boolean checkNotDup(int x, int []printed){
        for (int i = 0; i < printed.length; i++) {
            if (x == printed[i])
            return false;
        }
        return true;
    }
    public void print(){
        for (int i : printed) {
            System.out.println(i);
        }
    }
}
