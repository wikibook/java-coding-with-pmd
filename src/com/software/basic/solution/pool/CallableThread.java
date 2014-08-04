package com.software.basic.solution.pool;

import java.util.concurrent.Callable;
//스레드 실행 후결과를 반환 받을 수 있는 스레드
public class CallableThread implements Callable<Integer>{
    
    private int threadNum;
    
    //스레드 생성시 생성자를 통하여 각 스레드별 필요한 값을 전달 받을 수 있다.
    public CallableThread(int threadNum) {
        this.threadNum = threadNum;
    }
    
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        System.out.println("호출 가능한 스레드 [" + threadNum + "]");
        return threadNum;
    }
}