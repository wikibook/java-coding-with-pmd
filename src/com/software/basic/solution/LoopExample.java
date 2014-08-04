package com.software.basic.solution;

public class LoopExample {

    public static void main(String[] args) {
            //예제의 문제의 현상만 해결한 방법
            for (int i = 2; i < 10; i++) {
                
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " X " + j + " = " + i * j);
                }
            }
            
            //증감인자의 명칭을 단순 한 문자가 아닌 
            //변수 명명규칙에 따라 작명해서 
            //혼란을 방지한다.
            for(int preNum =2; preNum < 10; preNum++) {
                for(int postNum = 1; postNum < 10; postNum++) {
                    System.out.println(preNum + " X " + postNum + " = " + preNum * postNum);
                }
            }
            
            //기존과 같이 한 문자의 증감문자를 사용하지만
            //i와 j같이 혼동될 가능성이 있는 문자가 아닌
            //i와 k와 같은 문자를 사용하여 혼란을 방지한다.
            for (int i = 2; i < 10; i++) {
                
                for (int k = 1; k < 10; k++) {
                    System.out.println(i + " X " + k + " = " + i * k);
                }
            }
    }
}