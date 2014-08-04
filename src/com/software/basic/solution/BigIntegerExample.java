package com.software.basic.solution;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        /**
         * ���ʿ��� �ν��Ͻ��� ������ �ʰ� �̹� ���ǵ� ���� ���� ������ Ȱ������
         */
        BigInteger biZero = BigInteger.ZERO;
        
        BigInteger biOne = BigInteger.ONE;
        
        BigInteger biTen;
        biTen= BigInteger.TEN;

        /**
         * ���ǵ��� ���� ���� �⺻���� ������� �����ϸ� �ȴ�.
         */
        BigInteger biTest1 = new BigInteger("10000000");
        
        BigInteger biTest2 = BigInteger.valueOf(20000000);
        
        System.out.println(biZero.intValue() + biOne.intValue() + biTen.intValue()
                                        + biTest1.intValue() + biTest2.intValue());
    }
}