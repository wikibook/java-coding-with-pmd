package com.software.empty.problem;

public class EmptyWhileStmtExample {

    public static void main(String[] args) {
        // Start time
        System.out.println("����");
        long startTime = System.currentTimeMillis();
        int i=0;
        while(i++ < 100000000) {
        }
        
        long endTime = System.currentTimeMillis();
        long lTime = endTime - startTime;
        System.out.println("����[�ҿ�ð� : " + lTime + "ms]");
        //�ι�° ����
        System.out.println("����");
        startTime = System.currentTimeMillis();
        i=0;
        while(i++ < 100000000) {
        }
        endTime = System.currentTimeMillis();
        lTime = endTime - startTime;
        System.out.println("����[�ҿ�ð� : " + lTime + "ms]");
    }
}
