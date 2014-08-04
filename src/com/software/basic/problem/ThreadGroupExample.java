package com.software.basic.problem;

public class ThreadGroupExample implements Runnable {

    public static void main(String[] args) {
        ThreadGroupExample tg = new ThreadGroupExample();
        
        tg.func();
    }
    
        
    public void func() {
        try {
            //�θ� ���� ����
            ThreadGroup parentGroup = new ThreadGroup("Parent TG");
            
            //�ڽ� ���� ���� - �θ� ������ ���ڷ� �����ؾ� �Ѵ�.
            ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child TG");
            
            //�θ� ������ ������ ����
            Thread thread1 = new Thread(parentGroup, this);
            System.out.println(thread1.getName() +" ����");
            thread1.start();
            
            //�ڽ� ������ ������ ����
            Thread thread2 = new Thread(childGroup, this);
            System.out.println(thread2.getName() +" ����");
            thread2.start();
            
            //�ڽ� ������ ������ ����
            Thread thread3 = new Thread(childGroup, this);
            System.out.println(thread2.getName() +" ����");
            thread3.start();
            
            Thread[] list = new Thread[parentGroup.activeCount()];
            
            int count = parentGroup.enumerate(list);
            
            //�θ� ���տ� �ִ� ��� �����带 ����Ѵ�.
            for(int i=0; i < count; i++) {
                System.out.println("������ " + list[i].getName());
            }
            
            //�ٸ� �����尡 ���� ������ ��ٸ���.
            thread1.join();
            thread2.join();
            
            
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
    
    //�����尡 ������ �޼ҵ�
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " ���� ����");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}