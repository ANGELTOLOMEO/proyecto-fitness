package com.jumptraining.app.models;

public class Workout {
    private int rounds;
    private int roundTime;
    private int restTime;

    public Workout(int rounds, int roundTime, int restTime) {
        this.rounds = rounds;
        this.roundTime = roundTime;
        this.restTime = restTime;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRoundTime() {
        return roundTime;
    }

    public void setRoundTime(int roundTime) {
        this.roundTime = roundTime;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}
