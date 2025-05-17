package com.project.Models.Time;

import com.project.Models.Enums.Seasons;

import java.util.ArrayList;

public class Time {
    private final ArrayList<ObserveTime> observes = new ArrayList<>();

    private Seasons currentSeason = Seasons.Spring;
    private int spentDays = 0;
    private int currentHour = 9;
    private final int LengthOfSeason = 28;

    // getter

    public Seasons getCurrentSeason() {
        return currentSeason;
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public int getSpentDays() {
        return spentDays;
    }

    // add

    public void add(ObserveTime observeTime) {
        observes.add(observeTime);
    }

    //

    public void changeTime(int hour) {
        for (int i = 0; i < hour; i++)
            changeTimeByHour();
    }

    public void changeTimeByHour() {
        currentHour += 1;
        if (currentHour >= 22) {
            for (ObserveTime o : observes)
                o.passByDay();
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
            return;
        }
        for (ObserveTime o : observes)
            o.passByHour();
    }
}