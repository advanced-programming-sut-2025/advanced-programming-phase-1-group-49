package com.project.Models.Time;

import com.project.Models.Enums.Seasons;

public class Time {
    private Seasons currentSeason;
    private int spentDays;
    private int currentHour;

    public Seasons getCurrentSeason() {
        return currentSeason;
    }

    public int getLengthOfSeason() {
        return LengthOfSeason;
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public int getSpentDays() {
        return spentDays;
    }

    public void changeTime(int hour) {

    }
    private final int LengthOfSeason = 28;
}
