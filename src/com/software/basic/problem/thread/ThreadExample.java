package com.software.basic.problem.thread;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable runnable = new ThreadRunSample();
        Thread thread = new Thread(runnable);
        System.out.println("������ ȣ�� ����");
        thread.run();
        System.out.println("������ ȣ�� ����");
    }
}