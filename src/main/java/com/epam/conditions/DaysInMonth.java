package com.epam.conditions;

import java.util.Calendar;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if (year < 1){
            System.out.println("invalid date");
            return;
        }

        if (month <= 0 || month > 11){
            System.out.println("invalid date");
            return;
        }

        Calendar myCalendar = (Calendar) Calendar.getInstance().clone();
        myCalendar.set(year, month-1, 1);
        int max_date = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(max_date);
    }

}
