package com.software.basic.solution;

public class LoopExample {

    public static void main(String[] args) {
            //������ ������ ���� �ذ��� ���
            for (int i = 2; i < 10; i++) {
                
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " X " + j + " = " + i * j);
                }
            }
            
            //���������� ��Ī�� �ܼ� �� ���ڰ� �ƴ� 
            //���� ����Ģ�� ���� �۸��ؼ� 
            //ȥ���� �����Ѵ�.
            for(int preNum =2; preNum < 10; preNum++) {
                for(int postNum = 1; postNum < 10; postNum++) {
                    System.out.println(preNum + " X " + postNum + " = " + preNum * postNum);
                }
            }
            
            //������ ���� �� ������ �������ڸ� ���������
            //i�� j���� ȥ���� ���ɼ��� �ִ� ���ڰ� �ƴ�
            //i�� k�� ���� ���ڸ� ����Ͽ� ȥ���� �����Ѵ�.
            for (int i = 2; i < 10; i++) {
                
                for (int k = 1; k < 10; k++) {
                    System.out.println(i + " X " + k + " = " + i * k);
                }
            }
    }
}