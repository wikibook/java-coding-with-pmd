package com.software.string.problem;

public class WrongStringExample {
    public static void main(String[] args) {
        //���ʿ��� �ν��Ͻ�ȭ
        String value = new String("test");
        //���ʿ��� toString �޼ҵ� ��� 
        String value2 = value.toString();
        //���ڿ��� ���ڸ� ������ �� ���ʿ��� valueOf �޼ҵ带 ���
        String calValue = "1 + 1 = " + String.valueOf(2); 
        
    }
}