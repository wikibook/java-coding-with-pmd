package com.software.string.solution;

public class EmptyStringExample {

    public static void main(String[] args) {
        String emptyString = " ";
        
        if(isBlank(emptyString)) {
            System.out.println("emptyString�� ����ִ�.");
        } else {
            System.out.println("emptyString�� ������� �ʴ�.");
        }
    }
    
    //isWhitespace�� Ȱ���ϸ� ���ʿ��� �ν��Ͻ� ������ ���ϰ�
    //���� ��Ȯ�� ���鹮�ڸ� Ȯ���� �� �ִ�.
    public static boolean isBlank(final String str) {
        int strLen;
        boolean result = true;
        if (str == null || str.length() == 0) {
            result = true;
        } else {
            strLen = str.length();
            for (int i = 0; i < strLen; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}