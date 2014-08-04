package com.software.optimize.problem;

import java.math.BigDecimal;

public class AvoidArrayLoopsExample {

    public static void main(String[] args) {
        int[] source = new int[10000];
        
        //원본 배열에 값 입력
        for(int i=0; i < source.length; i++) {
            source[i] = i;
        }
        
        AvoidArrayLoopsExample example = new AvoidArrayLoopsExample();
        
        example.copyByClone(source);
        example.copyByLoop(source);
    }
    
    
    public void copyByLoop(int[] source) {
        int[] target = new int[source.length];
        
        long startTime = System.currentTimeMillis();
        
        for( int i =0; i < 100; i++) {
            for(int k=0; k < source.length; k++) {
                target[k] = source[k];
            }
        }
     // 종료 시간
        long endTime = System.currentTimeMillis();
        
        // 시간 출력
        System.out.println("##반복문 실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
    
    public void copyByClone(int[] source) {
        long startTime = System.currentTimeMillis();
        int[] target;
        for( int i =0; i < 100; i++) {
            target = source.clone();
        }
        // 종료 시간
        long endTime = System.currentTimeMillis();
        // 시간 출력
        System.out.println("##clone 실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
}