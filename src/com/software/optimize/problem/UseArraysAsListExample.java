package com.software.optimize.problem;

import java.util.ArrayList;
import java.util.List;

public class UseArraysAsListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        Integer[] array = new Integer[1000000];
        
        //�ݺ����� �̿��� ������ �Է�  
        for(int i=0; i < 1000000; i++) {
            array[i] = i;
        }
        // ���� �ð�
        long startTime = System.currentTimeMillis();
        
        //�ݺ����� �̿��� ������ �Է�  
        for(int i=0; i < 1000000; i++) {
            list.add(array[i]);
        }
        // ���� �ð�
        long endTime = System.currentTimeMillis();
        
        // �ð� ���
        System.out.println("##����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
}