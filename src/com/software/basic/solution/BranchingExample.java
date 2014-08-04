package com.software.basic.solution;

public class BranchingExample {
    public static void main(String[] args) {
        
        //제어문과 continue를 이용하여 0~10사이의 홀수를 출력하는 예 
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                //continue 문이 실행되면 continue문 아래의 모든 코드는 생략된다.
                continue;
            }
            System.out.println(i);
        }
        
        //제어문과 break문을 이용하여 반복문을 종료시키는 예 
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                break;
            }
            
        }
        
        //제어문과 return문을 이용하여 반복문과 메소드를 종료시키는 예
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
