package com.example.common;

import java.util.ArrayList;

public enum Month {
    JANUARY("January"),
    FEBRUARY("Febuary"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December")
    ;

    private String englishName;

    Month(String englishName){
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public static ArrayList<String> monthsFollowing(String chosenMonth){
        ArrayList<String> monthsReturned = new ArrayList<>();
        chosenMonth = chosenMonth.toUpperCase();
        boolean monthFound = false;
        for (Month month: Month.values()){
            if (month.name().equals(chosenMonth)){
                monthFound=true;
            }
            if (monthFound){
                monthsReturned.add(month.getEnglishName());
            }
        }
        return monthsReturned;
    }
}
