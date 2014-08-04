package com.software.optimize.solution;

import java.util.Arrays;
import java.util.List;

public class UseArraysAsListExample {
    public static void main(String[] args) {
        Integer[] array = new Integer[1000000];
        
        //�ݺ����� �̿��� ������ �Է�  
        for(int i=0; i < 1000000; i++) {
            array[i] = i;
        }
        // ���� �ð�
        long startTime = System.currentTimeMillis();
        
        List<Integer> list = (List<Integer>)Arrays.asList(array);
        
        // ���� �ð�
        long endTime = System.currentTimeMillis();
        
        // �ð� ���
        System.out.println("##����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
        
    }
}