package com.jumptraining.app.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "jump_sessions")
public class JumpSession {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private long date;
    private int totalJumps;
    private int rounds;
    private long duration;

    public JumpSession(long date, int totalJumps, int rounds, long duration) {
        this.date = date;
        this.totalJumps = totalJumps;
        this.rounds = rounds;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getTotalJumps() {
        return totalJumps;
    }

    public void setTotalJumps(int totalJumps) {
        this.totalJumps = totalJumps;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
