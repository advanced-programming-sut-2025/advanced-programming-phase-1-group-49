package com.project.Models.Enums;

import com.project.Models.Time.Season;

public enum Seasons {
    Spring(new Season()),
    Summer(new Season()),
    Fall(new Season()),
    Winter(new Season());

    private final Season season;

    Seasons(Season season) {
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }
}
