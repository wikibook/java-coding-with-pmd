package com.software.string.solution;

public class StartWithExample {
    public static void main(String[] args) {
        String strIndexOf = "0000UPD001";
        String strStartsWith = "UPD00001";
        String strChartAt = "U00001";
        
        //indexOf �޼ҵ�� ���ڿ� �� ��Ư�� ��ġ�� ���ڿ��� ã�� �� �����ϴ�.
        System.out.println("UPD�� 0000UPD001 ���ڿ��� " + strIndexOf.indexOf("UPD") + "��°�� ��ġ�ϰ� �ִ�.");
        
        //startsWith�� ���ڿ��� ���λ簡 �Ǵ� ���ڿ��� ã�� �� �����ϴ�.
        System.out.println("UPD�� UPD00001 ���ڿ���  ���λ��? " + strStartsWith.startsWith("UPD"));
        
        //chartAt�� ���ڿ����� �� ���ڸ� �˻��ϱ� ������ ���ڿ��� ù ���ڸ� ã�� �� �����ϴ�.
        System.out.println("U�� UPD00001 ���ڿ���  ù ���ڴ�? " + (strChartAt.charAt(0) == 'U'));
    }
}