package com.software.basic.solution;

public class NonStaticInitializerExample {

    private int value;
    
    private String str;
    
    private Integer num;
    
    {
        value = 2;
        System.out.println("�ʱ�ȭ�� ���� ����");
    }
    
    public NonStaticInitializerExample() {
        System.out.println(value);
    }
    
    public NonStaticInitializerExample(String str) {
        this.str = str;
        System.out.println(Integer.parseInt(this.str) - value);
    }
    
    public NonStaticInitializerExample(Integer num) {
        this.num = num;
        System.out.println(num - value);
    }
    
}
