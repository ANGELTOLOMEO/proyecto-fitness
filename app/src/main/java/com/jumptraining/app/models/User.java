package com.jumptraining.app.models;

public class User {
    private String name;
    private String profilePictureUrl;
    private int dailySteps;

    public User(String name, String profilePictureUrl, int dailySteps) {
        this.name = name;
        this.profilePictureUrl = profilePictureUrl;
        this.dailySteps = dailySteps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }
}
