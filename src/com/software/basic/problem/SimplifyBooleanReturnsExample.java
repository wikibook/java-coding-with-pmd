package com.software.basic.problem;

public class SimplifyBooleanReturnsExample {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(2));
    }
    
    public static boolean isEvenNumber(int value) {
        if(value % 2 ==0) {
            return true;
        } else {
            return false;
        }
    }
}