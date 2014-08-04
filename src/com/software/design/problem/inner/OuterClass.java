package com.software.design.problem.inner;

public class OuterClass {

    public OuterClass() {
        InnerClass innerClass = new InnerClass(); 
    }

    public class InnerClass {
    	/*
    	 * ���� Ŭ������ �����ڰ� private���� ���� ���ѵǾ�
    	 * OuterClass�� �����ڸ� ȣ���� �� �ִ�.
    	 */
        private InnerClass(){}
    }
    
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
    }
    
}