package com.software.basic.problem.dcl;

public class DclTest {
    
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                // 첫 번째 인스턴스 호출
                DclSample.getInstance().printStatus();    //1
            }
        };
        
        Thread thread2 = new Thread() {
            @Override
            public void run() {
            	// 두 번째 인스턴스 호출
                DclSample.getInstance().printStatus();    //5
            }
        };
        //스레드 시작
        thread1.start();
        thread2.start();
    }
}