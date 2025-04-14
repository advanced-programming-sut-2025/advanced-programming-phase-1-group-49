package Controllers;

public class TimeDateController {
    private int hour;
    private int year;
    private int month;
    private int day;
    private String dayName;

    private int TimeShow() {
        return hour;
    }

    private String DateShow() {
        return (year + "/" + month + "/" + day);
    }

    private String TimeDateShow() {
        return (hour + "  " + year + "/" + "/");
    }

    private String DayNameShow() {
        return dayName;
    }

    public int getHour() {
        return hour;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDayName() {
        return dayName;
    }

    // increase

    public void increaseTime() {

    }
}
