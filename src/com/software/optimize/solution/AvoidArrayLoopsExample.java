package com.software.optimize.solution;

public class AvoidArrayLoopsExample {

    public static void main(String[] args) {
        int[] source = new int[10000000];
        
        //원본 배열에 값 입력
        for(int i=0; i < source.length; i++) {
            source[i] = i;
        }
        
        AvoidArrayLoopsExample example = new AvoidArrayLoopsExample();
        
        example.copyByArrayCopy(source);
        
    }
    
    public void copyByArrayCopy(int[] source) {
        int[] target = new int[source.length]; 
        long startTime = System.currentTimeMillis();
        
        System.arraycopy(source, 0, target, 0, source.length); 
        // 종료 시간
        long endTime = System.currentTimeMillis();
        // 시간 출력
        System.out.println("##arraycopy 실행시간(초.0f) : " + ( endTime - startTime )/1000.0f +"초");
    }
}