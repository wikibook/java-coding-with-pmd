package com.software.basic.problem;

public class IfExample {

    public static void main(String[] args) {
        /**
         * 스파게티 소스가 만들어지는 과정
         */
        int num = 7;
        
        //최초의 조건
        if( num > 4 ) {
            System.out.println(num +"은 4보다 크다");
        }
        
        //1차 요구사항 변경
        if( num > 4 ) {
            if( num < 10) {
                System.out.println(num +"은 4보다 크고 10보다 작다");
            }
        }
        
        //2차 요구사항 변경
        if( num > 4 ) {
            if( num < 10) {
                System.out.println(num +"은 4보다 크고 10보다 작다");
            } else if (num > 11) {
                System.out.println(num +"은 11보다 크다");
            }
        }
    }
}