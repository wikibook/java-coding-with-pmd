package com.software.design.solution;

public class MissingBreakInSwitchExample2 {

    public static void main(String[] args) {
        int key = args != null ? Integer.parseInt( args[0] ) : 0;
        /*
         * �̷� ������� if���� ����ϴ� ����
         * ���� 3.1.11.2���� case���� ��ø�ؼ� ����ϴ� �� ���� ��Ȯ�ϸ� ȿ�����̴�.
         * Ư�� switch���� ������ ����� ���� case������ �����Ͽ��� ������,
         * if���� ���ǽ��� �������� ����� ���� ������ �� �ִ�. 
         */
        
        //if(key == 2 || key == 4)
        if(key % 2 == 0) {
        	System.out.println(key +  "�� ¦����.");
        } else {
        	System.out.println(key +  "�� Ȧ����.");
        }
    }
}