package com.software.design.problem.inner;

public class OuterClass {

    public OuterClass() {
        InnerClass innerClass = new InnerClass(); 
    }

    public class InnerClass {
    	/*
    	 * 내부 클래스의 생성자가 private으로 접근 제한되어
    	 * OuterClass만 생성자를 호출할 수 있다.
    	 */
        private InnerClass(){}
    }
    
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
    }
    
}