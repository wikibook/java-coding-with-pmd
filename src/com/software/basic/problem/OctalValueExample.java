package com.software.basic.problem;

public class OctalValueExample {
    public static void main(String[] args) {
        //16���� ǥ����
        int hexValue = 0xFF;
        //10���� ǥ����
        int decValue = 98;
        //8���� ǥ����
        int octValue = 076;
        
        /**
         * ������ ������ �ٸ� �������� ����Ǿ�������, ������ ��ȯ�� ����� �����ϴ�.
         */
        System.out.println(String.format("hexValue�� 16���� ��: %x\t|\t10���� ��:  %d\t|\t8���� ��: %o", hexValue,hexValue,hexValue) );
        System.out.println(String.format("decValue�� 16���� ��: %x\t|\t10���� ��:  %d\t|\t8���� ��: %o", decValue,decValue,decValue) );
        System.out.println(String.format("octValue�� 16���� ��: %x\t|\t10���� ��:  %d\t|\t8���� ��: %o", octValue,octValue,octValue) );
        
        System.out.println("\n��� ���� ��: " + (hexValue + decValue + octValue));
    }
}