package com.software.empty.problem;

public class EmptyWhileStmtExample {

    public static void main(String[] args) {
        // Start time
        System.out.println("시작");
        long startTime = System.currentTimeMillis();
        int i=0;
        while(i++ < 100000000) {
        }
        
        long endTime = System.currentTimeMillis();
        long lTime = endTime - startTime;
        System.out.println("종료[소요시간 : " + lTime + "ms]");
        //두번째 실행
        System.out.println("시작");
        startTime = System.currentTimeMillis();
        i=0;
        while(i++ < 100000000) {
        }
        endTime = System.currentTimeMillis();
        lTime = endTime - startTime;
        System.out.println("종료[소요시간 : " + lTime + "ms]");
    }
}
