package com.software.braces.problem;

public class StringBuilderExample {
    public static void main(String[] args) {
        String text = "0123456789";
        StringBuilder result = new StringBuilder(10000000);
        // 시작 시간
        long startTime = System.currentTimeMillis();
        // + 연산자보다 10배 많은 연산
        for(int i=0; i < 1000000; i++) {
            result.append(text);
        }
        // 종료 시간
        long endTime = System.currentTimeMillis();
        
        // 시간 출력
        System.out.println("##  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초"); 
    }
}