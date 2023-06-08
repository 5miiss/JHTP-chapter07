package com.example;
public class App {
    public static void main(String[] args) {
        Time2 time2 = new Time2(86399);
        time2.printTime();
        time2.tick();
        time2.printTime();
        time2.tick();
        time2.printTime();
        time2.incrementHour();
        time2.printTime();

        TrafficLight trafficLight = TrafficLight.GREEN;
        for (TrafficLight trafficLight1 : TrafficLight.values()) {
            System.out.println("the enum is :  "+trafficLight1+ " its duration value is  : "+trafficLight1.getDuration());
            
        }
    }
}
