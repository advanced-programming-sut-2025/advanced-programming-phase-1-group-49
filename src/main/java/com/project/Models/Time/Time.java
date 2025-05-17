package com.project.Models.Time;

import com.project.Models.Enums.Day;
import com.project.Models.Enums.Season;
import com.project.Models.Enums.Weathers;

import java.util.ArrayList;
import java.util.Random;

public class Time {

    /*
     * ehtemalat Weathers ro bayad benevisam
     * */

    private final ArrayList<ObserveTime> observes = new ArrayList<>();
    private Season currentSeason = Season.Spring;
    private int spentMonth = 0;
    private int spentDays = 0;
    private int currentHour = 9;
    private Weathers currentWeather = null;
    private Weathers nextWeather = null;
    private final Day[] days = new Day[]
            {Day.Monday, Day.Tuesday, Day.Wednesday, Day.Thursday, Day.Friday, Day.Saterday, Day.Sunday};
    private int currentDay = 0;

    public Time() {
        Random rand = new Random();
        int weather = rand.nextInt(4);
        switch (weather) {
            case 0:
                currentWeather = Weathers.RAIN;
                break;
            case 1:
                currentWeather = Weathers.SNOW;
                break;
            case 2:
                currentWeather = Weathers.STORM;
                break;
            case 3:
                currentWeather = Weathers.SUNNY;
                break;
        }

        weather = rand.nextInt(4);
        switch (weather) {
            case 0:
                nextWeather = Weathers.RAIN;
                break;
            case 1:
                nextWeather = Weathers.SNOW;
                break;
            case 2:
                nextWeather = Weathers.STORM;
                break;
            case 3:
                nextWeather = Weathers.SUNNY;
                break;
        }
    }

    // getter

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public int getSpentDays() {
        return spentDays;
    }

    public int getSpentMonth() {
        return spentMonth;
    }

    public Weathers getCurrentWeather() {
        return currentWeather;
    }

    public Day getCurrentDay() {
        return days[currentDay];
    }

    public Weathers getWeatherForecast() {
        return nextWeather;
    }

    // add

    public void add(ObserveTime observeTime) {
        observes.add(observeTime);
    }

    //

    private Weathers getNextWeather() {
        Random rand = new Random();
        int weather = rand.nextInt(4);
        return switch (weather) {
            case 0 -> Weathers.RAIN;
            case 1 -> Weathers.SNOW;
            case 2 -> Weathers.STORM;
            default -> Weathers.SUNNY;
        };
    }

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
            currentWeather = nextWeather;
            nextWeather = getNextWeather();
            currentDay++;
            if (currentDay >= days.length)
                currentDay = 0;
            if (spentDays >= 28) {
                switch (currentSeason) {
                    case Spring:
                        currentSeason = Season.Summer;
                        break;
                    case Summer:
                        currentSeason = Season.Fall;
                        break;
                    case Fall:
                        currentSeason = Season.Winter;
                        break;
                    case Winter:
                        currentSeason = Season.Spring;
                        break;
                }
                spentDays = 0;
                spentMonth++;
            }
            return;
        }
        for (ObserveTime o : observes)
            o.passByHour();
    }

    // setter

    public void setCurrentWeather(Weathers currentWeather) {
        this.currentWeather = currentWeather;
    }
}