package com.software.basic.solution;

public class BranchingExample {
    public static void main(String[] args) {
        
        //����� continue�� �̿��Ͽ� 0~10������ Ȧ���� ����ϴ� �� 
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                //continue ���� ����Ǹ� continue�� �Ʒ��� ��� �ڵ�� �����ȴ�.
                continue;
            }
            System.out.println(i);
        }
        
        //����� break���� �̿��Ͽ� �ݺ����� �����Ű�� �� 
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                break;
            }
            
        }
        
        //����� return���� �̿��Ͽ� �ݺ����� �޼ҵ带 �����Ű�� ��
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
