package com.example;
public class Eployee {
    private static int count = 0;
    private String firstNAme;
    private String lastNAme;
    
    public int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Eployee.count = count;
    }
    public String getFirstNAme() {
        return firstNAme;
    }
    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }
    public String getLastNAme() {
        return lastNAme;
    }
    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }
    public Eployee(String firstNAme, String lastNAme) {
        this.firstNAme = firstNAme;
        this.lastNAme = lastNAme;
        ++count;
        System.out.printf("%-10s %-10s total emp count is : %d",firstNAme,lastNAme,count);
    }

    

}
