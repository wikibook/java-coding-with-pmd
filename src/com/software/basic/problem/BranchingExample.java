package com.software.basic.problem;

public class BranchingExample {
    public static void main(String[] args) {
        
        //����� break���� �̿��Ͽ� �ݺ����� �����Ű�� �� 
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            break;
        }
        
        //����� return���� �̿��Ͽ� �ݺ����� �޼ҵ带 �����Ű�� ��
        for(int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            return;
        }
    }
}