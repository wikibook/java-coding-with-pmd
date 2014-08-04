package com.software.optimize.problem;

import java.util.ArrayList;
import java.util.List;

public class UseArraysAsListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        Integer[] array = new Integer[1000000];
        
        //반복문을 이용한 데이터 입력  
        for(int i=0; i < 1000000; i++) {
            array[i] = i;
        }
        // 시작 시간
        long startTime = System.currentTimeMillis();
        
        //반복문을 이용한 데이터 입력  
        for(int i=0; i < 1000000; i++) {
            list.add(array[i]);
        }
        // 종료 시간
        long endTime = System.currentTimeMillis();
        
        // 시간 출력
        System.out.println("##실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
}