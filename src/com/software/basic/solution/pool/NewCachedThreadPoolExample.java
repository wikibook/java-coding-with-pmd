package com.software.basic.solution.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class NewCachedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        // cached thread pool ����
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        //���డ���� ������ ����
        executorService.execute(new RunnableThread(0));
        executorService.execute(new RunnableThread(1));
        
        //ȣ�Ⱑ���� ������ ����
        Future<Integer> future = executorService.submit(new CallableThread(2));
        
        //ȣ�Ⱑ����     �������� �� �������
        int value = future.get();
        
        System.out.println(value);
        
        boolean isTerminated = executorService.isTerminated();
        
        System.out.println(isTerminated);
        
        //������ Ǯ�� ��������� ����Ǳ���� 30�ʸ� ��ٸ���.
        executorService.awaitTermination(30, TimeUnit.SECONDS);
        
        //������ Ǯ ����
        executorService.shutdownNow();
                
    }
}