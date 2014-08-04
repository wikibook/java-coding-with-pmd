package com.software.basic.solution;

public class SimplifyBooleanReturnsExample {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(2));
    }
    
    public static boolean isEvenNumber(int value) {
        return value % 2 ==0;
    }
}