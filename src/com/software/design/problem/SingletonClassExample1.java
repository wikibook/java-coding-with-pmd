package com.software.design.problem;

import java.text.DecimalFormat;

/**
 * Singleton Ŭ������ ���� Ŭ������ �̿��Ͽ� �����ϴ� ��� 
 * @author Byeongseon
 *
 */
public class SingletonClassExample1 {
    
    /**
     * Singleton Ŭ������ �ϳ��� ��ü�� �����ؾ� �ϹǷ� 
     * �ܺο��� �������� Ŭ���� ������ ���� ���Ͽ�
     * �����ڴ� private���� ���� ���ѵȴ�.
     */
    private SingletonClassExample1(){}

    /**
     * Singleton Ŭ������ ���� �ν��Ͻ��� ������ ���� Ŭ������ ����
     * ��ü�� ���ϼ��� �����Ѵ�.
     * @author Byeongseon
     */
    private static class SingletonClassExample1Builder{
        static final SingletonClassExample1 instance = new SingletonClassExample1();
    }
    
    /**
     * ��ü�� ������ �ν��Ͻ��� ���� Ŭ������ static �ʵ�κ��� ȣ���Ͽ� �����Ѵ�.
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