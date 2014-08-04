package com.software.string.problem;

public class WrongStringExample {
    public static void main(String[] args) {
        //불필요한 인스턴스화
        String value = new String("test");
        //불필요한 toString 메소드 사용 
        String value2 = value.toString();
        //문자열에 숫자를 결합할 때 불필요한 valueOf 메소드를 사용
        String calValue = "1 + 1 = " + String.valueOf(2); 
        
    }
}