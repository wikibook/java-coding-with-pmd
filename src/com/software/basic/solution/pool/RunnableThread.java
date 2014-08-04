package com.software.basic.solution.pool;

//단순 실행을 위해서 사용되는 스레드
public class RunnableThread implements Runnable {

    private int threadNum;
    
    public RunnableThread(int threadNum) {
        this.threadNum = threadNum;
    }
    
    @Override
    public void run(){
        
        try {
            Thread.sleep(1000);
            System.out.println("실행 가능한 스레드 [" + threadNum + "]");
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
}