package com.stir.cscu9t4practical1;

public class SwimSession extends TrainingSession {
    // Additional attributes specific to swim sessions
    private String waterType;

    public SwimSession(String name, int day, int month, int year, int hours, int minutes, int seconds, float distance, String waterType) {
        super(name, day, month, year, hours, minutes, seconds, distance);
        this.waterType = waterType;
    }

    // Additional methods specific to swim sessions
    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
}