package com.stir.cscu9t4practical1;

public class RunSession extends TrainingSession {
    // Additional attributes specific to run/sprints sessions
    private String terrain;

    public RunSession(String name, int day, int month, int year, int hours, int minutes, int seconds, float distance, String terrain) {
        super(name, day, month, year, hours, minutes, seconds, distance);
        this.terrain = terrain;
    }

    // Additional methods specific to run/sprints sessions
    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }
}