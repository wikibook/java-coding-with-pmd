package com.software.basic.problem;

public class BooleanExample {

    //Boolean 객체의 불필요한 인스턴스 생성의 예
    public static void main(String[] args) {

        Boolean bool = new Boolean(true);
        
        Boolean bool2 = Boolean.valueOf(false);
        
    }
}