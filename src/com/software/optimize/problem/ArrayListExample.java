package com.software.optimize.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		// ���� �ð�
        long startTime = System.currentTimeMillis();
        
		List<String> list = new ArrayList<String>();
		for(int i =0; i < 100000; i++) {
			list.add("���ڿ�_" +i);
		}
		
		for(String str : list) {
			//�ӵ� �׽�Ʈ�� ���� �ƹ��͵� �� ��
		}
		
		for(int i =0; i < 100000; i++) {
			list.indexOf("���ڿ�_" +i);
		}
			
		// ���� �ð�
        long endTime = System.currentTimeMillis();
		// �ð� ���
        System.out.println("##  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
	}
	
	
}
