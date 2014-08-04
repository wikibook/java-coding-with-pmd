package com.software.optimize.solution;

import java.util.Arrays;
import java.util.List;

public class ArrayCopyExample {
	
	 public static void main(String[] args) {
	        Integer[] source = new Integer[10000000];
	        
	        //원본 배열에 값 입력
	        for(int i=0; i < source.length; i++) {
	            source[i] = i;
	        }
	        
	        ArrayCopyExample example = new ArrayCopyExample();
	        
	        example.copyByArrayCopy(source);
	        //example.array2List(source);
	        
	    }
	
	public void copyByArrayCopy(Integer[] source) {
		//시작 시간
        long startTime = System.currentTimeMillis();
        
        Integer[] target = new Integer[source.length];

        //arraycopy를 활용하면 
        System.arraycopy(source, 0, target, 0	, source.length); 
        // 종료 시간
        long endTime = System.currentTimeMillis();
        // 시간 출력
        System.out.println("##arraycopy 실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
	
	public void array2List(Integer[] source) {
		//시작 시간
        long startTime = System.currentTimeMillis();
        
        //Arrays.asList를 활용하면 배열을 리스트로 복사하는 방식 
        List<Integer> list = (List<Integer>)Arrays.asList(source); 
        // 종료 시간
        long endTime = System.currentTimeMillis();
        // 시간 출력
        System.out.println("##asList 실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
	}
}
