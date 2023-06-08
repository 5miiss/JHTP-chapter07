package com.example;

public enum TrafficLight {
    RED(15), GREEN(10), YELLOW(20);
    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private TrafficLight(int duration) {
        this.duration = duration;
    }
    
}
