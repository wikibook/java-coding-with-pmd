package com.software.basic.problem.initializer;

public class NonStaticInitializerExample {

    private int value = 1;
    {
        value = 2;
        System.out.println("�ʱ�ȭ�� ���� ����");
    }
    
    public NonStaticInitializerExample() {
        System.out.println(value);
        System.out.println("�����ڴ� ���߿� ����ȴ�.");
    }
    
}