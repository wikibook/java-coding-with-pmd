package com.software.optimize.problem;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// ���� �ð�
        long startTime = System.currentTimeMillis();
        
		List<String> vector = new Vector<String>();
		for(int i =0; i < 100000; i++) {
			vector.add("���ڿ�_" +i);
		}
		
		for(String str : vector) {
			//�ӵ� �׽�Ʈ�� ���� �ƹ��͵� �� ��
		}
		
		for(int i =0; i < 100000; i++) {
			vector.indexOf("���ڿ�_" +i);
		}
			
		// ���� �ð�
        long endTime = System.currentTimeMillis();
		// �ð� ���
        System.out.println("##  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
	}
	
	
}
