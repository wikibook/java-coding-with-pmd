package com.software.optimize.solution.immutable;

import java.math.BigDecimal;

public class ImmutableObjectExample {

    public static void main(String[] args) {
        String str = "test";
        System.out.println("변경 전 문자열: " + str);
        //문자열을 대문자로 변경하는 메소드를 수행하면
        //대문자로 변경된 새로운 문자열을 생성해서 반환한다.
        str = str.toUpperCase();
        System.out.println("변경 후 문자열: " + str);
        
        BigDecimal big = new BigDecimal(10);
        System.out.println("변경 전 BigDecimal 값: " + big);
        //기존 BigDecimal에 20을 더하는 메소드를 수행하면
        //기존 값인 10과 20을 더한 새로운 객체를 생성해서 반환한다.
        big = big.add(new BigDecimal(20));
        System.out.println("변경 후 BigDecimal 값: " + big);
        
    }
}
