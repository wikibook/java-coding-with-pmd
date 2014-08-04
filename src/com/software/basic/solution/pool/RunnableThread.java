package com.software.basic.solution.pool;

//�ܼ� ������ ���ؼ� ���Ǵ� ������
public class RunnableThread implements Runnable {

    private int threadNum;
    
    public RunnableThread(int threadNum) {
        this.threadNum = threadNum;
    }
    
    @Override
    public void run(){
        
        try {
            Thread.sleep(1000);
            System.out.println("���� ������ ������ [" + threadNum + "]");
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
}