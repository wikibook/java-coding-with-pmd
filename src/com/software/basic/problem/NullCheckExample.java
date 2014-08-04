package com.software.basic.problem;

public class NullCheckExample {

    public static void main(String[] args) {
        String a = "abcde";
        String b = null;
        
        //�Ʒ��� �ڵ带 �� ���ξ� �����غ���.
        
        System.out.println(isNull(b));
        /*
        
        System.out.println(isNull(a));
        
        System.out.println(isNull2(a));
        System.out.println(isNull2(b));
        */
    }
    
    //�߸��� �� �� �޼ҵ� 1
    public static boolean isNull(String value) {
        boolean result;
        
        //value�� ���� null�� �ƴ� ��쿡�� value.equals("")�� ����Ǿ���ϴµ� 
        //value�� null�� ���� value.equals("")�� ����Ǿ� NullPointerException�� �߻��ȴ�.
        //�̿� ���� ��Ȳ���� �ùٸ� �������ڴ� &&�� �ƴ� ||�� �Ǿ�� �Ѵ�.
        
        if (value == null && value.equals("")) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    //�߸��� �� �� �޼ҵ� 1
    public static boolean isNull2(String value) {
        boolean result;
        
        //value�� ���� null�� ��쿡�� value.equals("")�� ����Ǹ�
        //NullPointerException�� �߻��ȴ�.
        //�̿� ���� ��Ȳ���� �ùٸ� �������ڴ� ||�� �ƴ� &&�� �Ǿ�� �Ѵ�.
        if (value != null || !value.equals("")) {
            result = false;
        } else {
            result = true;
        }
        
        return result;
    }
}