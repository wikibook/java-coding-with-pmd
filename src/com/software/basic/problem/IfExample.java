package com.software.basic.problem;

public class IfExample {

    public static void main(String[] args) {
        /**
         * ���İ�Ƽ �ҽ��� ��������� ����
         */
        int num = 7;
        
        //������ ����
        if( num > 4 ) {
            System.out.println(num +"�� 4���� ũ��");
        }
        
        //1�� �䱸���� ����
        if( num > 4 ) {
            if( num < 10) {
                System.out.println(num +"�� 4���� ũ�� 10���� �۴�");
            }
        }
        
        //2�� �䱸���� ����
        if( num > 4 ) {
            if( num < 10) {
                System.out.println(num +"�� 4���� ũ�� 10���� �۴�");
            } else if (num > 11) {
                System.out.println(num +"�� 11���� ũ��");
            }
        }
    }
}