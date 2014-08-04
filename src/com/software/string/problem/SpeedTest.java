package com.software.string.problem;

public class SpeedTest {
	public static void main(String[] args) {
		SpeedTest example = new SpeedTest();
        
        example.stringAppend();
        example.stringbuilderAppend();
        
    }
    
    public void stringAppend() {
           // 시작 시간
           long startTime = System.currentTimeMillis();
           String test = "0123456789";
           for(int i=0; i < 1000000; i++) {
               test += test;
           }
           // 종료 시간
           long endTime = System.currentTimeMillis();
           
           // 시간 출력
           System.out.println("##startWith  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
    
    public void stringbuilderAppend() {
           // 시작 시간
           long startTime = System.currentTimeMillis();
           
           StringBuilder test = new StringBuilder();
           for(int i=0; i < 1000000; i++) {
               test.append("0123456789");
           }
           // 종료 시간
           long endTime = System.currentTimeMillis();
           
           // 시간 출력
           System.out.println("##charAt  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
}
