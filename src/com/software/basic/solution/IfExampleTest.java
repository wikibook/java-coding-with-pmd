package com.software.basic.solution;

import org.junit.Before;
import org.junit.Test;

public class IfExampleTest {

    private static String param;    
    
    /**
     * @Before ������̼��� �̿��ϸ�
     * if(true)�� ������ ������ ����ϵ��� �����ϴ� ���� �ƴ�
     * �Ʒ��� �޼ҵ�� ���� �� �ڵ��� ���� ����   
     * �ʿ��� ���� ��Ȳ�� ���� �׽�Ʈ�� �� �ִ�.
     */
    @Before
    public void setParam() {
        param = "admin";
    }
    
    @Test
    public void test() {
            boolean isAdmin = "admin".equals(param);  
            
            //������ ���������� Ȯ���ϰ� �����ؾ� �ϴ� �ڵ�������,
            //�����ڰ� ���Ƿ� ���μ��� ������ Ȯ�� �ϱ� ���Ͽ� ���Ƿ� ������ ���ǹ�
            if(isAdmin) {
                System.out.println("�������Դϴ�.");
                
                /**
                 * ��� �� �ڵ�
                 */
            }
    }
}
