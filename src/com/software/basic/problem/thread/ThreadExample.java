package com.software.basic.problem.thread;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable runnable = new ThreadRunSample();
        Thread thread = new Thread(runnable);
        System.out.println("스레드 호출 시작");
        thread.run();
        System.out.println("스레드 호출 종료");
    }
}