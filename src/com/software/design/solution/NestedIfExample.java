package com.software.design.solution;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class NestedIfExample {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(Locale.KOREA);
        
        for(int i=1900; i <=calendar.get(Calendar.YEAR); i++) {
            if(isLeapYear(i)) {
                System.out.println(i + "���� �����Դϴ�.");
            }
        }
    }
    
    public static boolean isLeapYear(int year) {
        boolean result;
        //������ 4�θ� �������� �����̴�.
        if(year % 4 == 0 && year % 100 != 0 && year % 400 != 0 ) {
            result = true;
        //������ 4,100,400���� ���������� �����̴�.
        } else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) {
            result = true;
        //�ƴϸ� ������ �ƴϴ�.
        } else {
            result = false;
        }
        return result;
    }
}