package com.software.design.problem;

import java.text.DecimalFormat;

/**
 * Singleton 클래스를 내부 클래스를 이용하여 구현하는 방식 
 * @author Byeongseon
 *
 */
public class SingletonClassExample1 {
    
    /**
     * Singleton 클래스는 하나의 객체만 유지해야 하므로 
     * 외부에서 직접적인 클래스 생성을 막기 위하여
     * 생성자는 private으로 접근 제한된다.
     */
    private SingletonClassExample1(){}

    /**
     * Singleton 클래스의 단일 인스턴스를 관리할 내부 클래스를 만들어서
     * 객체의 유일성을 유지한다.
     * @author Byeongseon
     */
    private static class SingletonClassExample1Builder{
        static final SingletonClassExample1 instance = new SingletonClassExample1();
    }
    
    /**
     * 객체의 유일한 인스턴스를 내부 클래스의 static 필드로부터 호출하여 전달한다.
     * @return
     */
    public static SingletonClassExample1 getInstance() {
        return SingletonClassExample1Builder.instance;
    }
    
    
    public boolean isEmpty(String value) {
        return value == null || value.isEmpty() ? true : false;
    }
    
    public String changeMoney(String str) {
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(Integer.valueOf(str));
    }
}