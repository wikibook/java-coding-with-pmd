package com.software.basic.problem;

import java.math.BigDecimal;

public class BigDecimalExample3 {

    public static void main(String[] args) {
        
        BigDecimal value = new BigDecimal("1");
        BigDecimal value2 = new BigDecimal("1.00");
        BigDecimal value3 = new BigDecimal(1.00);

        System.out.println(value.compareTo(BigDecimal.ONE)==0); //��
        System.out.println(value.equals(BigDecimal.ONE)); //��
        
        System.out.println(value.compareTo(value2)==0); //��
        System.out.println(value.equals(value2)); //����
        
        System.out.println(value2.compareTo(value3)==0); //��
        System.out.println(value2.equals(value3)); //����
        
        System.out.println(value2.compareTo(BigDecimal.ONE)==0); //��
        System.out.println(value2.equals(BigDecimal.ONE)); //����
    }
}