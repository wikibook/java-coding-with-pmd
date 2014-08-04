package com.software.design.problem;

import java.text.DecimalFormat;
/**
 * ������ ����ȭ�� �̿��� �̱��� Ŭ���� ���� ���
 * @author Byeongseon
 *
 */
public class SingletonClassExample2 {
    private volatile static SingletonClassExample2 instance;
    
    private SingletonClassExample2() {}
    
    public static SingletonClassExample2 getInstance() {
        //����ȭ�� ������ ����ȭ ���� ����Ͽ� ������ ����ȭ�� ����
    	//�ӵ����ϸ� �ּ�ȭ�Ѵ�.
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
