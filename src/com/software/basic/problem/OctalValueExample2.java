package com.software.basic.problem;

public class OctalValueExample2 {
    public static void main(String[] args) {
        /**
         * �Ʒ��� �� ������ �и� �ٸ� �������� 
         * ���� ������ ȥ���� �� �ִ�. 
         */
        int decValue = 10;
        int octValue = 010;    //octValue�� 10�ƴ϶� 8�̴�.
        
        System.out.println(String.format("10������ ��ȯ�� ��: decValue = %d | octValue = %d", decValue, octValue));
        
        /**
         * �Ʒ��� �� ���� ���� 10������ ���ε� ���ɼ��� ����. 
         */
        int octNum1 = 012;
        int octNum2 = 010;
        
        System.out.println(String.format("����� 120�� �ƴ� %d �̴�", octNum1 * octNum2));
        
    }
}