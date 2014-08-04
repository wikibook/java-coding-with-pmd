package com.software.basic.solution;

public class BranchingExample2 {
    public static void main(String[] args) {
        
        int result = 0;
        //잘못된 제어문과 예약어의 조합
        for(int i=0; i < 10; i++) {
            if (i*i > 25) {
                result = i*i;
                break;
            }
            
        }
        
        System.out.println("결과: " + result);
    }
}