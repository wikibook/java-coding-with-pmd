package com.software.basic.problem;

public class OctalValueExample {
    public static void main(String[] args) {
        //16진수 표현법
        int hexValue = 0xFF;
        //10진수 표현법
        int decValue = 98;
        //8진수 표현법
        int octValue = 076;
        
        /**
         * 각각의 변수가 다른 진법으로 선언되어있지만, 진법간 변환과 계산이 가능하다.
         */
        System.out.println(String.format("hexValue의 16진수 값: %x\t|\t10진수 값:  %d\t|\t8진수 값: %o", hexValue,hexValue,hexValue) );
        System.out.println(String.format("decValue의 16진수 값: %x\t|\t10진수 값:  %d\t|\t8진수 값: %o", decValue,decValue,decValue) );
        System.out.println(String.format("octValue의 16진수 값: %x\t|\t10진수 값:  %d\t|\t8진수 값: %o", octValue,octValue,octValue) );
        
        System.out.println("\n모든 값의 합: " + (hexValue + decValue + octValue));
    }
}