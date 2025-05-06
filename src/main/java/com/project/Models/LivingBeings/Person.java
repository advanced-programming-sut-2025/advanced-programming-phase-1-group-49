package com.project.Models.LivingBeings;

import com.project.Models.Enums.Gender;
import com.project.Models.Time.ObserveTime;

public abstract class Person implements LivingBeings, ObserveTime {
    protected String nickname;
    protected Gender gender;
}
