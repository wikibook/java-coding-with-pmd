package com.software.basic.problem;

public class ThreadGroupExample implements Runnable {

    public static void main(String[] args) {
        ThreadGroupExample tg = new ThreadGroupExample();
        
        tg.func();
    }
    
        
    public void func() {
        try {
            //부모 집합 생성
            ThreadGroup parentGroup = new ThreadGroup("Parent TG");
            
            //자식 집합 생성 - 부모 집합을 인자로 전달해야 한다.
            ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child TG");
            
            //부모 집합의 스레드 생성
            Thread thread1 = new Thread(parentGroup, this);
            System.out.println(thread1.getName() +" 시작");
            thread1.start();
            
            //자식 집합의 스레드 생성
            Thread thread2 = new Thread(childGroup, this);
            System.out.println(thread2.getName() +" 시작");
            thread2.start();
            
            //자식 집합의 스레드 생성
            Thread thread3 = new Thread(childGroup, this);
            System.out.println(thread2.getName() +" 시작");
            thread3.start();
            
            Thread[] list = new Thread[parentGroup.activeCount()];
            
            int count = parentGroup.enumerate(list);
            
            //부모 집합에 있는 모든 스레드를 출력한다.
            for(int i=0; i < count; i++) {
                System.out.println("스레드 " + list[i].getName());
            }
            
            //다른 스레드가 끝날 때까지 기다린다.
            thread1.join();
            thread2.join();
            
            
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
    
    //스레드가 실행할 메소드
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " 실행 종료");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}