package com.software.basic.problem;

import java.math.BigDecimal;

public class BigDecimalExample {
    
    public static void main(String[] args) {
        
        /**
         * double을 이용해서 계산할 경우 정확한 값을 계산할 수 없다.
         */
        double dValue1 = 4.7;
        double dValue2 = 0.4;
        
        System.out.println("double을 이용한 값 계산의 예: " + dValue1 + " + " + dValue2 + " = " + (dValue1 + dValue2));
        
        
        /**
         * BigDecimal을 이용할 경우 정확한 소수점 계산의 값을 얻을 수 있다.
         */
        //Bigdecmial의 선언은 아래의 두가지 방법과  BigInteger와 같이 ZERO, ONE 그리고 TEN이 이미 정의되어 있다.
        BigDecimal bdValue1 = new BigDecimal("4.7");
        BigDecimal bdValue2 = BigDecimal.valueOf(0.4);
        
        //BigDecmial은 계산은 연산자가 아닌 add:더하기,subtract:빼기,multiply:곱하기, divide:나누기 등의 메소드를 이용한다. 
        System.out.println("BigDecimal을 이용한 값 계산의 예: " + bdValue1 + " + " + bdValue2 + " = " + bdValue1.add(bdValue2));
    }
}
