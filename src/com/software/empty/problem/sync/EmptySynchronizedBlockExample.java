package com.software.empty.problem.sync;

public class EmptySynchronizedBlockExample {

    public static int saving = 9000;

    public static void main(String[] args) {
        //예금을 동시에 인출할 스레드를 생성한다. 
        WithdrawThread thread0 = new WithdrawThread(0, 1000);
        WithdrawThread thread1 = new WithdrawThread(1, 2000);
        WithdrawThread thread2 = new WithdrawThread(2, 4000);
        WithdrawThread thread3 = new WithdrawThread(3, 3000);
        WithdrawThread thread4 = new WithdrawThread(4, 5000);

        //예금을 동시에 인출할 스레드를 실행시킨다.
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
    }
}