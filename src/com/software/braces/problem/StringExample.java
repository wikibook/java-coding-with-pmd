package com.software.braces.problem;

public class StringExample {
	public static void main(String[] args) {
		String text = "0123456789";
		String result = "";
		// ���� �ð�
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 100000; i++) {
			result += text;
		}
		// ���� �ð�
        long endTime = System.currentTimeMillis();
		
        // �ð� ���
        System.out.println("##  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��"); 
	}
	
}
 