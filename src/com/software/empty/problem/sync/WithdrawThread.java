package com.software.empty.problem.sync;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class WithdrawThread extends Thread {
    private int withdraw;
    private int index;

    public WithdrawThread(int index, int withdraw) {
        this.withdraw = withdraw;
        this.index = index;
    }

    @Override
    public void run(){
        //예금 한도를 초과하는 금액은 인출하지 못하도록 방지한다.
        if(EmptySynchronizedBlockExample.saving -withdraw >= 0) {
             
            try {
                //출금과 프로세스의 소요 시간을 가정한 지연시간
                SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
                int randInt = random.nextInt(400);
                Thread.sleep(randInt);
            } catch (NoSuchAlgorithmException e1) {
                e1.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //예금을 인출한다.
            EmptySynchronizedBlockExample.saving -= withdraw;
            System.out.println("Thread["+ index + "] 잔액: " + EmptySynchronizedBlockExample.saving + " (출금: " + withdraw + ")");
        } else {
            System.out.println("Thread["+ index + "] 잔액이 부족합니다. [" +EmptySynchronizedBlockExample.saving+"] (출금 요청: " + withdraw + ")");
        }
        
    }
}