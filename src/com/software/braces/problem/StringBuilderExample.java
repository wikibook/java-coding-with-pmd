package com.software.braces.problem;

public class StringBuilderExample {
    public static void main(String[] args) {
        String text = "0123456789";
        StringBuilder result = new StringBuilder(10000000);
        // ���� �ð�
        long startTime = System.currentTimeMillis();
        // + �����ں��� 10�� ���� ����
        for(int i=0; i < 1000000; i++) {
            result.append(text);
        }
        // ���� �ð�
        long endTime = System.currentTimeMillis();
        
        // �ð� ���
        System.out.println("##  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��"); 
    }
}