package com.hakerrank.Introduction.JavaDateTime;

import java.time.LocalDate;
public class Solution {
    public static String getDay(String day, String month, String year) {
        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return date.getDayOfWeek().name();

    }
}