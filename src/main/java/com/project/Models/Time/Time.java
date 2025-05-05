package com.project.Models.Time;

import com.project.Models.Enums.Seasons;

public class Time {
    private Seasons currentSeason = Seasons.Spring;
    private int spentDays = 0;
    private int currentHour = 9;

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
        this.currentHour += hour;
        if (this.currentHour >= 22) {
            this.currentHour = 9;
            this.spentDays ++;
            if (this.spentDays >= 28) {
                switch (this.currentSeason) {
                    case Spring:
                        this.currentSeason = Seasons.Summer;
                        break;

                    case Summer:
                        this.currentSeason = Seasons.Fall;
                        break;

                    case Fall:
                        this.currentSeason = Seasons.Winter;
                        break;

                    case Winter:
                        this.currentSeason = Seasons.Spring;
                        break;
                }
                spentDays = 0;
            }
        }
    }
    private final int LengthOfSeason = 28;
}
