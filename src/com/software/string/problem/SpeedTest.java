package com.software.string.problem;

public class SpeedTest {
	public static void main(String[] args) {
		SpeedTest example = new SpeedTest();
        
        example.stringAppend();
        example.stringbuilderAppend();
        
    }
    
    public void stringAppend() {
           // ���� �ð�
           long startTime = System.currentTimeMillis();
           String test = "0123456789";
           for(int i=0; i < 1000000; i++) {
               test += test;
           }
           // ���� �ð�
           long endTime = System.currentTimeMillis();
           
           // �ð� ���
           System.out.println("##startWith  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
    
    public void stringbuilderAppend() {
           // ���� �ð�
           long startTime = System.currentTimeMillis();
           
           StringBuilder test = new StringBuilder();
           for(int i=0; i < 1000000; i++) {
               test.append("0123456789");
           }
           // ���� �ð�
           long endTime = System.currentTimeMillis();
           
           // �ð� ���
           System.out.println("##charAt  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
}
