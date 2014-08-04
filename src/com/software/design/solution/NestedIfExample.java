package com.software.design.solution;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class NestedIfExample {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(Locale.KOREA);
        
        for(int i=1900; i <=calendar.get(Calendar.YEAR); i++) {
            if(isLeapYear(i)) {
                System.out.println(i + "년은 윤년입니다.");
            }
        }
    }
    
    public static boolean isLeapYear(int year) {
        boolean result;
        //연도가 4로만 나눠지면 윤년이다.
        if(year % 4 == 0 && year % 100 != 0 && year % 400 != 0 ) {
            result = true;
        //연도가 4,100,400으로 나누어져도 윤년이다.
        } else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) {
            result = true;
        //아니면 윤년이 아니다.
        } else {
            result = false;
        }
        return result;
    }
}