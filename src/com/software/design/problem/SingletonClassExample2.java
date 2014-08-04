package com.software.design.problem;

import java.text.DecimalFormat;
/**
 * 스레드 동기화를 이용한 싱글턴 클래스 구현 방법
 * @author Byeongseon
 *
 */
public class SingletonClassExample2 {
    private volatile static SingletonClassExample2 instance;
    
    private SingletonClassExample2() {}
    
    public static SingletonClassExample2 getInstance() {
        //지역화된 스레드 동기화 블럭을 사용하여 스레드 동기화로 인한
    	//속도저하를 최소화한다.
        synchronized (SingletonClassExample2.class) {
            if(instance == null) {
                instance = new SingletonClassExample2();
            }
        }
        return instance;
    }
    
    public boolean isEmpty(String value) {
        return value == null || value.isEmpty() ? true : false;
    }
    
    public String changeMoney(String str) {
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(Integer.valueOf(str));
    }
}
