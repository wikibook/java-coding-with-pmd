package com.software.string.problem;

public class WrongCaseCompareExample {

    public static void main(String[] args) {
        String value1 = "abcDEF";
        
        String value2 = "ABCdef";
        
        //모든 글자를 대문자로 변환 후 비교
        if(value1.toUpperCase().equals(value2.toUpperCase())) {
            System.out.println("value1 & value2는 같다");
        } else {
            System.out.println("value1 & value2는 다르다");
        }
        
        //모든 글자를 소문자로 변환 후 비교
        if(value1.toLowerCase().equals(value2.toLowerCase())) {
            System.out.println("value1 & value2는 같다");
        } else {
            System.out.println("value1 & value2는 다르다");
        }
        
    }
    
}
