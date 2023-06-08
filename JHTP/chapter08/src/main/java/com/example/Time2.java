package com.example;
public class Time2 {
    private int secondsSinceMidnight;
    
    public Time2(int secondsSinceMidnight){
        this.secondsSinceMidnight = secondsSinceMidnight;
    }

    public int getHour(){
            return this.secondsSinceMidnight / 3600 % 24;  
    }

    public int getMinute(){
                    
        return (int) Math.ceil(this.secondsSinceMidnight / 60 % 60);
    
    }
    public int getSecond(){
        return  this.secondsSinceMidnight % 60;
    }

    public void tick(){
        this.secondsSinceMidnight++;
    }
    public void incrementMinute(){
        this.secondsSinceMidnight += 60;
    }
    public void incrementHour(){
        this.secondsSinceMidnight += 3600;
    }

    public void printTime(){
        System.out.printf("The time in 24 hours format now is  %02d H %02d M %02d S\n", getHour(), getMinute(), getSecond());
        System.out.printf("The time in 12 hours format now is  %02d H %02d M %02d S %s\n", getHour()%12, getMinute(), getSecond()
                            ,getHour() < 12 ? "AM":"PM");

    }
}
