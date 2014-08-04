package com.software.string.problem;

public class StartWithExample2 {
    public static void main(String[] args) {
        StartWithExample2 example = new StartWithExample2();
        
        example.doStartsWith();
        example.doCharAt();
        
    }
    
    public void doStartsWith() {
        String str = "U00001";
        
        // ���� �ð�
           long startTime = System.currentTimeMillis();
           //startsWith�� ���λ縦 100�� ȸ ��  
           for(int i=0; i < 1000000; i++) {
               if(str.startsWith("U")) {
                   //System.out.println("��ǰ ������ �����մϴ�.");
               }
           }
           // ���� �ð�
           long endTime = System.currentTimeMillis();
           
           // �ð� ���
           System.out.println("##startWith  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
    
    public void doCharAt() {
        String str = "U00001";
        
        // ���� �ð�
           long startTime = System.currentTimeMillis();
           //charAt���� ���λ縦 100�� ȸ ��  
           for(int i=0; i < 1000000; i++) {
               if(str.charAt(0) == 'U') {
                   //System.out.println("��ǰ ������ �����մϴ�.");
               }
           }
           // ���� �ð�
           long endTime = System.currentTimeMillis();
           
           // �ð� ���
           System.out.println("##charAt  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
}