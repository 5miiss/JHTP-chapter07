package com.chapter07;

import com.chapter07.ArraysManipulation.Arr;
import com.chapter07.ArraysManipulation.Table;
import com.chapter07.cards.DeckOfCards;
import com.chapter07.grades.Grades;
import com.chapter07.grades.GradesArr;
import com.chapter07.leetcode.Solution;
import com.chapter07.twodimarrays.twod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // DeckOfCards myDeckOfCards = new DeckOfCards();
        // myDeckOfCards.shuffle();
        // for (int i = 1; i <= 52; i++){
        //     System.out.printf("%-19s", myDeckOfCards.dealCard());
        //     if (i % 4 == 0) 
        //     System.out.println();
        // }

        // int []gradrsArr = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        // Grades grades = new Grades(gradrsArr, "java");
        // System.out.println("the value of average is  : "+ grades.getAvg());
        // System.out.println("the value of max is  : "+ grades.getMAx());
        // System.out.println("the value of min is  : "+ grades.getMin());
        // grades.outputGrades();
        // grades.outputBarChart();

        // twod test = new twod();
        // test.fillArr();
        // test.printArr();

        // Solution test1 = new Solution();
        // String res = test1.mergeAlternately("abc", "pqr");
        // System.out.println(res);

        // int[][] gradesArray = {{87, 96, 70},
        // {68, 87, 90},
        // {94, 100, 90},
        // {100, 81, 82},
        // {83, 65, 85},
        // {78, 87, 65},
        // {85, 75, 83},
        // {91, 94, 100},
        // {76, 72, 84},
        // {87, 93, 73}};

        // GradesArr gradesArr = new GradesArr(gradesArray, "java");
        // printArr(gradesArr.getMax());
        // printArr(gradesArr.getMin());

        // printArr(gradesArr.getAvgPerStudent());
        // gradesArr.outputBarChart();

        Arr arr = new Arr();
        arr.foo();
        Table table = new Table();
        table.init();

    }
    public static void printArr(Object o){
        if (o instanceof int[]){
            int []array = (int[]) o;
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

        if (o instanceof double[]){
            double []array = (double[]) o;
            for(double d: array)
                System.out.println(d);
        }
    }
}
