package com.project.Models.Enums;

import com.project.Models.Weather.Weather;

public enum Weathers {
    SUNNY(new Weather()),
    RAIN(new Weather()),
    SNOW(new Weather()),
    STORM(new Weather());

    private final Weather weather;

    Weathers(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }
}
