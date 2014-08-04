package com.software.basic.problem.thread;

public class ThreadRunSample implements Runnable{
    
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("작업이 실행됨");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}