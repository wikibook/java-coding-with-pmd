package com.software.basic.solution;

public class NullCheckExample {

    public static void main(String[] args) {
        String a = "abcde";
        String b = null;
        
        System.out.println(isNull(a));
        System.out.println(isNull(b));
        
        System.out.println(isNull2(a));
        System.out.println(isNull2(b));
    }
    
    //잘못된 널 비교 메소드 1
    public static boolean isNull(String value) {
        boolean result;
        
        //정상적인 null 비교 조건
        if (value == null || value.equals("")) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    //잘못된 널 비교 메소드 1
    public static boolean isNull2(String value) {
        boolean result;
        
        //정상적인 null 비교 조건
        if (value != null && !value.equals("")) {
            result = false;
        } else {
            result = true;
        }
        
        return result;
    }
}