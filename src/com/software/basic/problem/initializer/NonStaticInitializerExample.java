package com.software.basic.problem.initializer;

public class NonStaticInitializerExample {

    private int value = 1;
    {
        value = 2;
        System.out.println("초기화절 먼저 실행");
    }
    
    public NonStaticInitializerExample() {
        System.out.println(value);
        System.out.println("생성자는 나중에 실행된다.");
    }
    
}