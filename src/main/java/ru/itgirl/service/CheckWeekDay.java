package ru.itgirl.service;

import java.util.Locale;

public class CheckWeekDay {
    public static String checkWeekDay(String weekday) {
        switch (weekday) {
            case "monday":
                weekday = "Понедельник";
                break;
            case "tuesday":
                weekday = "Вторник";
                break;
            case "wednesday":
                weekday = "Среда";
                break;
            case "thursday":
                weekday = "Четверг";
                break;
            case "friday":
                weekday = "Пятница";
                break;
            case "saturday":
                weekday = "Суббота";
                break;
            case "sunday":
                weekday = "Воскресенье";
                break;
        }
        return weekday;
    }

}
