package com.software.basic.problem;

public class NullCheckExample2 {

    public static void main(String[] args) {
        
    	//전달인자가 null일 경우 두 메소드 모두 NullPointerException이 발생한다.
        //isEmpty("test");
        isEmpty(null);
        
        //isEmpty2("test");
        isEmpty2(null);
        
    }
    
    public static boolean isEmpty(String value) {
        
        // value가 null일 경우 NullPointerException이 발생하며
        // value가 null이 아닐 경우 equals가 실행됨으로 value != null은 불필요한 체크이다.
        // value != null를 먼저 비교하고 후에 value.equals("")를 하는 것이 올바른 방법이다.
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
        // value가 null일 경우 NullPointerException이 발생해야 하며
        // equals는 작동하지 않아야 한다.
        // 그러므로 value == null 과 같은 체크는 잘못된 null 체크이다.
        if (value.equals("") || value == null) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}