package com.project.Models.Time;

import com.project.Models.Enums.Seasons;

public class Time {
    private Seasons currentSeason = Seasons.Spring;
    private int spentDays = 0;
    private int currentHour = 9;
    private final int LengthOfSeason = 28;

    public Seasons getCurrentSeason() {
        return currentSeason;
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public int getSpentDays() {
        return spentDays;
    }

    public void changeTime(int hour) {
        currentHour += hour;

        if (currentHour >= 22) {
            currentHour = 9;
            spentDays++;
            if (spentDays >= 28) {
                switch (currentSeason) {
                    case Spring:
                        currentSeason = Seasons.Summer;
                        break;

                    case Summer:
                        currentSeason = Seasons.Fall;
                        break;

                    case Fall:
                        currentSeason = Seasons.Winter;
                        break;

                    case Winter:
                        currentSeason = Seasons.Spring;
                        break;
                }
                spentDays = 0;
            }
        }

        // call time function
    }
}