package com.software.optimize.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		// 시작 시간
        long startTime = System.currentTimeMillis();
        
		List<String> list = new ArrayList<String>();
		for(int i =0; i < 100000; i++) {
			list.add("문자열_" +i);
		}
		
		for(String str : list) {
			//속도 테스트를 위해 아무것도 안 함
		}
		
		for(int i =0; i < 100000; i++) {
			list.indexOf("문자열_" +i);
		}
			
		// 종료 시간
        long endTime = System.currentTimeMillis();
		// 시간 출력
        System.out.println("##  실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
	}
	
	
}
