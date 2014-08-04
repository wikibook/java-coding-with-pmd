package com.software.string.problem;

public class EmptyStringExample {

    public static void main(String[] args) {
        String emptyString = " ";
        //trim과 length를 이용한 방식은 불필요한 인스턴스 생성과
        //isWhiteSpace 메소드보다 정확도가 떨어진다.
        if(emptyString.trim().length() == 0) {
            System.out.println("emptyString은 비어있다.");
        } else {
            System.out.println("emptyString은 비어있지 않다.");
        }
    }
}