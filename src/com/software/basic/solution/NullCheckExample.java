package com.software.basic.solution;

public class NullCheckExample {

    public static void main(String[] args) {
        String a = "abcde";
        String b = null;
        
        System.out.println(isNull(a));
        System.out.println(isNull(b));
        
        System.out.println(isNull2(a));
        System.out.println(isNull2(b));
    }
    
    //�߸��� �� �� �޼ҵ� 1
    public static boolean isNull(String value) {
        boolean result;
        
        //�������� null �� ����
        if (value == null || value.equals("")) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    //�߸��� �� �� �޼ҵ� 1
    public static boolean isNull2(String value) {
        boolean result;
        
        //�������� null �� ����
        if (value != null && !value.equals("")) {
            result = false;
        } else {
            result = true;
        }
        
        return result;
    }
}