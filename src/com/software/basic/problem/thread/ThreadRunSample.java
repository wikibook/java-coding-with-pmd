package com.software.basic.problem.thread;

public class ThreadRunSample implements Runnable{
    
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("�۾��� �����");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}