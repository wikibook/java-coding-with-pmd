package com.software.basic.problem;

public class NullCheckExample {

    public static void main(String[] args) {
        String a = "abcde";
        String b = null;
        
        //아래의 코드를 한 라인씩 실행해보자.
        
        System.out.println(isNull(b));
        /*
        
        System.out.println(isNull(a));
        
        System.out.println(isNull2(a));
        System.out.println(isNull2(b));
        */
    }
    
    //잘못된 널 비교 메소드 1
    public static boolean isNull(String value) {
        boolean result;
        
        //value의 값이 null이 아닐 경우에만 value.equals("")이 실행되어야하는데 
        //value가 null일 때만 value.equals("")이 실행되어 NullPointerException이 발생된다.
        //이와 같은 상황에서 올바른 논리연산자는 &&가 아닌 ||가 되어야 한다.
        
        if (value == null && value.equals("")) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    //잘못된 널 비교 메소드 1
    public static boolean isNull2(String value) {
        boolean result;
        
        //value의 값이 null일 경우에도 value.equals("")이 실행되며
        //NullPointerException이 발생된다.
        //이와 같은 상황에서 올바른 논리연산자는 ||가 아닌 &&가 되어야 한다.
        if (value != null || !value.equals("")) {
            result = false;
        } else {
            result = true;
        }
        
        return result;
    }
}