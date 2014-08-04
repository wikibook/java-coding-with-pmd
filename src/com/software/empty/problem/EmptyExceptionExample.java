package com.software.empty.problem;

public class EmptyExceptionExample {

    public static void main(String[] args) {
        
        String str = null;

        try {
            System.out.println(str.substring(0,2));
        //비어있는 catch 절로 인하여 NullPointerException이 무시된다.
        } catch(Exception e) {
        } 
        

        //정상적으로 오류가 발생한다.
        System.out.println(str.substring(0,2));
    }

}
