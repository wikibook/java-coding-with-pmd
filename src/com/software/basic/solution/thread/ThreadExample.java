package com.software.basic.solution.thread;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable runnable = new ThreadRunSample();
        Thread thread = new Thread(runnable);
        System.out.println("������ ȣ�� ����");
        thread.start();
        System.out.println("������ ȣ�� ����");
    }
}