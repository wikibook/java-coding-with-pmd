package com.software.basic.solution;

public class OctalValueExample {
    public static void main(String[] args) {
        /**
         * ��� ��ġ�� 10������ �����Ͽ� ����Ѵ�.
         */
        int decValue1 = 10;
        int decValue2 = 8;
        int decResult = decValue1 + decValue2;
        
        //�ٸ� ����� ǥ���� ���� �ʿ��� ������ ��ȯ�Ͽ� ����Ѵ�.
        System.out.println(String.format("16���� ��: %x\t|\t10���� ��:  %d\t|\t8���� ��: %o", decResult,decResult,decResult) );
        
    }
}