package com.software.basic.problem;

import java.math.BigDecimal;

public class BigDecimalExample2 {

    public static void main(String[] args) {
        
        //정수값을 이용한 선언 
        BigDecimal bdValue1 = new BigDecimal(12);
        
        //자연수를 이용한 선언
        BigDecimal bdValue2 = new BigDecimal(1.123);

        System.out.println("bdValue1: " + bdValue1);
        System.out.println("bdValue2: " + bdValue2);
    }
}