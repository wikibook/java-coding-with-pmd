package com.software.basic.problem.dcl;

public class DclTest {
    
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                // ù ��° �ν��Ͻ� ȣ��
                DclSample.getInstance().printStatus();    //1
            }
        };
        
        Thread thread2 = new Thread() {
            @Override
            public void run() {
            	// �� ��° �ν��Ͻ� ȣ��
                DclSample.getInstance().printStatus();    //5
            }
        };
        //������ ����
        thread1.start();
        thread2.start();
    }
}