package com.software.string.problem;

public class StartWithExample {
    public static void main(String[] args) {
        StartWithExample example = new StartWithExample();
        
        example.doStartsWith();
        example.doIndexOf();
        
    }
    
    public void doStartsWith() {
        String str = "UPD00001";
        
        // ���� �ð�
           long startTime = System.currentTimeMillis();
           //startsWith�� ���λ縦 100�� ȸ ��  
           for(int i=0; i < 1000000; i++) {
               if(str.startsWith("UPD")) {
                   //System.out.println("��ǰ ������ �����մϴ�.");
               }
           }
           // ���� �ð�
           long endTime = System.currentTimeMillis();
           
           // �ð� ���
           System.out.println("##startWith  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
    
    public void doIndexOf() {
        String str = "UPD00001";
        
        // ���� �ð�
           long startTime = System.currentTimeMillis();
           //indexOf�� ���λ縦 100�� ȸ ��  
           for(int i=0; i < 1000000; i++) {
               if(str.indexOf("UPD") == 0) {
                   //System.out.println("��ǰ ������ �����մϴ�.");
               }
           }
           // ���� �ð�
           long endTime = System.currentTimeMillis();
           
           // �ð� ���
           System.out.println("##indexOf  ����ð�(��.0f) : " + ( endTime - startTime )/1000.0f +"��");
    }
}