package com.software.basic.solution.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class NewCachedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        // cached thread pool 생성
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        //실행가능한 스레드 실행
        executorService.execute(new RunnableThread(0));
        executorService.execute(new RunnableThread(1));
        
        //호출가능한 스레드 시작
        Future<Integer> future = executorService.submit(new CallableThread(2));
        
        //호출가능한     스레드의 값 갖어오기
        int value = future.get();
        
        System.out.println(value);
        
        boolean isTerminated = executorService.isTerminated();
        
        System.out.println(isTerminated);
        
        //스레드 풀의 스레드들이 종료되기까지 30초를 기다린다.
        executorService.awaitTermination(30, TimeUnit.SECONDS);
        
        //스레드 풀 종료
        executorService.shutdownNow();
                
    }
}