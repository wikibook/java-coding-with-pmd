package com.software.string.problem;

public class WrongCaseCompareExample {

    public static void main(String[] args) {
        String value1 = "abcDEF";
        
        String value2 = "ABCdef";
        
        //��� ���ڸ� �빮�ڷ� ��ȯ �� ��
        if(value1.toUpperCase().equals(value2.toUpperCase())) {
            System.out.println("value1 & value2�� ����");
        } else {
            System.out.println("value1 & value2�� �ٸ���");
        }
        
        //��� ���ڸ� �ҹ��ڷ� ��ȯ �� ��
        if(value1.toLowerCase().equals(value2.toLowerCase())) {
            System.out.println("value1 & value2�� ����");
        } else {
            System.out.println("value1 & value2�� �ٸ���");
        }
        
    }
    
}
