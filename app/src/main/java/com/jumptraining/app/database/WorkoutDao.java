package com.jumptraining.app.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.jumptraining.app.models.JumpSession;

import java.util.List;

@Dao
public interface WorkoutDao {
    @Insert
    void insert(JumpSession jumpSession);

    @Query("SELECT * FROM jump_sessions ORDER BY date DESC")
    List<JumpSession> getAllSessions();
}
