package com.software.design.problem;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class NestedIfExample2 {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(Locale.KOREA);
        
        for(int i=1900; i < calendar.get(Calendar.YEAR); i++) {
            if(isLeapYear(i)) {
                System.out.println(i + "년은 윤년입니다.");
            }
        }
    }
    
    public static boolean isLeapYear(int year) {
        boolean result = false;
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if( year % 400 == 0 ) {
                    result = true;
                }
            } else {
                result = true;
            }
        }
        return result;
    }
} 
