package com.chapter07.grades;

public class Grades {
    private int[] grades;
    private String courseName;

    public Grades(int[] grades, String courseName) {
        this.grades = grades;
        this.courseName = courseName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMAx() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grades.length; i++) {
            if (max < grades[i])
                max = grades[i];
        }
        return max;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < grades.length; i++) {
            if (min > grades[i])
                min = grades[i];
        }
        return min;
    }

    public double getAvg() {
        int total = 0;

        for (int x : grades)
            total += x;

        return (double) total / grades.length;
    }

    public void outputBarChart() {
        System.out.println("grades Distribution : ");
        int []frequency = new int[11];
        for(int i = 0; i < grades.length ; i++)
            ++frequency[grades[i]/10];

        for(int i = 0; i < frequency.length; i++){
            if(i == 10)
                System.out.printf("%5d : ",100);
            else
            System.out.printf("%02d-%02d : ",i*10,i*10+9);

            for (int j = 0; j < frequency[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades()

    {

        System.out.printf("The grades are:%n%n");

        for (int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d%n",
                    student + 1, grades[student]);
    }
}
