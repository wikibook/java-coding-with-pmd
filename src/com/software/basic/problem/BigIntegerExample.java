package com.software.basic.problem;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger biZero = new BigInteger("0");
        
        BigInteger biOne = BigInteger.valueOf(100);
        
        BigInteger biTen;
        biTen= new BigInteger("10");

        System.out.println(biZero.intValue() + biOne.intValue() + biTen.intValue());
    }
}