package com.software.optimize.problem;

import java.math.BigDecimal;

public class AvoidArrayLoopsExample {

    public static void main(String[] args) {
        int[] source = new int[10000];
        
        //���� �迭�� �� �Է�
        for(int i=0; i < source.length; i++) {
            source[i] = i;
        }
        
        AvoidArrayLoopsExample example = new AvoidArrayLoopsExample();
        
        example.copyByClone(source);
        example.copyByLoop(source);
    }
    
    
    public void copyByLoop(int[] source) {
        int[] target = new int[source.length];
        
        long startTime = System.currentTimeMillis();
        
        for( int i =0; i < 100; i++) {
            for(int k=0; k < source.length; k++) {
                target[k] = source[k];
            }
        }
     // ���� �ð�
        long endTime = System.currentTimeMillis();
        
        // �ð� ���
        System.out.println("##�ݺ��� ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
    
    public void copyByClone(int[] source) {
        long startTime = System.currentTimeMillis();
        int[] target;
        for( int i =0; i < 100; i++) {
            target = source.clone();
        }
        // ���� �ð�
        long endTime = System.currentTimeMillis();
        // �ð� ���
        System.out.println("##clone ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
}