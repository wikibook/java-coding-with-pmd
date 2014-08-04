package com.software.basic.solution;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        /**
         * 불필요한 인스턴스를 만들지 않고 이미 정의된 값은 직접 참조를 활용하자
         */
        BigInteger biZero = BigInteger.ZERO;
        
        BigInteger biOne = BigInteger.ONE;
        
        BigInteger biTen;
        biTen= BigInteger.TEN;

        /**
         * 정의되지 않은 값은 기본적인 방식으로 정의하면 된다.
         */
        BigInteger biTest1 = new BigInteger("10000000");
        
        BigInteger biTest2 = BigInteger.valueOf(20000000);
        
        System.out.println(biZero.intValue() + biOne.intValue() + biTen.intValue()
                                        + biTest1.intValue() + biTest2.intValue());
    }
}