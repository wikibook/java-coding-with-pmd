package com.software.basic.problem;

public class NullCheckExample2 {

    public static void main(String[] args) {
        
    	//�������ڰ� null�� ��� �� �޼ҵ� ��� NullPointerException�� �߻��Ѵ�.
        //isEmpty("test");
        isEmpty(null);
        
        //isEmpty2("test");
        isEmpty2(null);
        
    }
    
    public static boolean isEmpty(String value) {
        
        // value�� null�� ��� NullPointerException�� �߻��ϸ�
        // value�� null�� �ƴ� ��� equals�� ��������� value != null�� ���ʿ��� üũ�̴�.
        // value != null�� ���� ���ϰ� �Ŀ� value.equals("")�� �ϴ� ���� �ùٸ� ����̴�.
        boolean result;
        if (!value.equals("") && value != null) {
            result = false;
        } else {
            result = true;
        }
        return result;
        
    }

    public static boolean isEmpty2(String value) {
        boolean result;
        // value�� null�� ��� NullPointerException�� �߻��ؾ� �ϸ�
        // equals�� �۵����� �ʾƾ� �Ѵ�.
        // �׷��Ƿ� value == null �� ���� üũ�� �߸��� null üũ�̴�.
        if (value.equals("") || value == null) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}