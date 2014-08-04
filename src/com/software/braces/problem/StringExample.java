package com.software.braces.problem;

public class StringExample {
	public static void main(String[] args) {
		String text = "0123456789";
		String result = "";
		// 시작 시간
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 100000; i++) {
			result += text;
		}
		// 종료 시간
        long endTime = System.currentTimeMillis();
		
        // 시간 출력
        System.out.println("##  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초"); 
	}
	
}
 