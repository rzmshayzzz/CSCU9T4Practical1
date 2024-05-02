package com.stir.cscu9t4practical1;

public class TrainingSession {
    protected String name;
    protected int day;
    protected int month;
    protected int year;
    protected int hours;
    protected int minutes;
    protected int seconds;
    protected float distance;

    public TrainingSession(String name, int day, int month, int year, int hours, int minutes, int seconds, float distance) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.distance = distance;
    }
}