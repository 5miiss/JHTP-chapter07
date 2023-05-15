package com.chapter07.grades;


public class GradesArr {
    private int [][]gradesArr;
    private String courseName;
    public int[][] getGradesArr() {
        return gradesArr;
    }
    public void setGradesArr(int[][] gradesArr) {
        this.gradesArr = gradesArr;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public GradesArr(int[][] gradesArr, String courseName) {
        this.gradesArr = gradesArr;
        this.courseName = courseName;
    }
    public GradesArr() {
    }

    public int [] getMax(){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int [] arr = new int[3];
        for (int i = 0; i < gradesArr.length; i++) {
            if (max1 < gradesArr[i][0])
                    max1 = gradesArr[i][0];
                
            if (max2 < gradesArr[i][1])
                    max2 = gradesArr[i][1];

            if (max3 < gradesArr[i][2])
                    max3 = gradesArr[i][2];
        }
        arr[0] = max1;
        arr[1] = max2;
        arr[2] = max3;
        return arr;
    }

    public int [] getMin(){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int [] arr = new int[3];
        for (int i = 0; i < gradesArr.length; i++) {
            if (min1 > gradesArr[i][0])
                    min1 = gradesArr[i][0];
                
            if (min2 > gradesArr[i][1])
                    min2 = gradesArr[i][1];

            if (min3 > gradesArr[i][2])
                    min3 = gradesArr[i][2];
        }
        arr[0] = min1;
        arr[1] = min2;
        arr[2] = min3;
        return arr;
    }
    public int sum(int [][]arr1, int courseIndex){
        
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i][courseIndex];
        }
        return sum;
    }

    public int sum(int studentIndex,int [][]arr1){
        
        int sum = 0;
        for (int i = 0; i < arr1[studentIndex].length; i++) {
            sum += arr1[studentIndex][i];
        }
        return sum;
    }

    public double[] getAvgForEachTest(){
        double []doubleArr = new double[3];
        //     int sum1 = sum(gradesArr, 0);
        //     int sum2 = sum(gradesArr, 1);
        //     int sum3 = sum(gradesArr, 2);
        //     System.out.println(gradesArr.length);
        // double avg1 = (double) sum1/gradesArr.length;
        // double avg2 = (double) sum2/gradesArr.length;
        // double avg3 = (double) sum3/gradesArr.length;
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = ((double)sum(gradesArr, i)/gradesArr.length);
        }
        return doubleArr;
    }

    public double[] getAvgPerStudent(){
        double []doubleArr = new double[10];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = ((double)sum(i,gradesArr)/gradesArr[i].length);
        }
        return doubleArr;
    }

    public void outputBarChart(){
        int []frequency =new int [11];
        for (int i = 0; i < gradesArr.length; i++) {
            for (int j = 0; j < gradesArr[i].length; j++) {
                ++frequency[(gradesArr[i][j])/10];
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (i == 10)
                System.out.printf("%05d : ",100);
            else
                System.out.printf("%02d-%02d : ", i*10,i*10+9);

            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
