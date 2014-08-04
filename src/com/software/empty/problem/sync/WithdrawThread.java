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
        //���� �ѵ��� �ʰ��ϴ� �ݾ��� �������� ���ϵ��� �����Ѵ�.
        if(EmptySynchronizedBlockExample.saving -withdraw >= 0) {
             
            try {
                //��ݰ� ���μ����� �ҿ� �ð��� ������ �����ð�
                SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
                int randInt = random.nextInt(400);
                Thread.sleep(randInt);
            } catch (NoSuchAlgorithmException e1) {
                e1.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //������ �����Ѵ�.
            EmptySynchronizedBlockExample.saving -= withdraw;
            System.out.println("Thread["+ index + "] �ܾ�: " + EmptySynchronizedBlockExample.saving + " (���: " + withdraw + ")");
        } else {
            System.out.println("Thread["+ index + "] �ܾ��� �����մϴ�. [" +EmptySynchronizedBlockExample.saving+"] (��� ��û: " + withdraw + ")");
        }
        
    }
}