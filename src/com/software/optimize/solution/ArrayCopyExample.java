package com.software.optimize.solution;

import java.util.Arrays;
import java.util.List;

public class ArrayCopyExample {
	
	 public static void main(String[] args) {
	        Integer[] source = new Integer[10000000];
	        
	        //���� �迭�� �� �Է�
	        for(int i=0; i < source.length; i++) {
	            source[i] = i;
	        }
	        
	        ArrayCopyExample example = new ArrayCopyExample();
	        
	        example.copyByArrayCopy(source);
	        //example.array2List(source);
	        
	    }
	
	public void copyByArrayCopy(Integer[] source) {
		//���� �ð�
        long startTime = System.currentTimeMillis();
        
        Integer[] target = new Integer[source.length];

        //arraycopy�� Ȱ���ϸ� 
        System.arraycopy(source, 0, target, 0	, source.length); 
        // ���� �ð�
        long endTime = System.currentTimeMillis();
        // �ð� ���
        System.out.println("##arraycopy ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
	
	public void array2List(Integer[] source) {
		//���� �ð�
        long startTime = System.currentTimeMillis();
        
        //Arrays.asList�� Ȱ���ϸ� �迭�� ����Ʈ�� �����ϴ� ��� 
        List<Integer> list = (List<Integer>)Arrays.asList(source); 
        // ���� �ð�
        long endTime = System.currentTimeMillis();
        // �ð� ���
        System.out.println("##asList ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
	}
}
