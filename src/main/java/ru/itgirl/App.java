package ru.itgirl;

import ru.itgirl.service.CheckWeekDay;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели на английском языке: ");
        String weekDay = in.next().toLowerCase();
        weekDay = CheckWeekDay.checkWeekDay(weekDay);
        System.out.println(weekDay);
    }
}



