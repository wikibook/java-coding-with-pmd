package com.software.basic.solution.pool;

import java.util.concurrent.Callable;
//������ ���� �İ���� ��ȯ ���� �� �ִ� ������
public class CallableThread implements Callable<Integer>{
    
    private int threadNum;
    
    //������ ������ �����ڸ� ���Ͽ� �� �����庰 �ʿ��� ���� ���� ���� �� �ִ�.
    public CallableThread(int threadNum) {
        this.threadNum = threadNum;
    }
    
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        System.out.println("ȣ�� ������ ������ [" + threadNum + "]");
        return threadNum;
    }
}