package com.software.basic.solution;
public class BadComparisonExample {

    public static void main(String[] args) {
        // ��� ������ ���ڰ� �ƴ� ��(NaN; Not a Number)�� �Ҵ�
        Double errorValue = Double.NaN;
        
        // ������ �����ϱ� ���� ���� ���� Double.NaN���� ��  
        if(Double.isNaN(errorValue)) {
            System.out.println("���� �߻�");
        } else {
            System.out.println("���� ó��");
        }
    }
}
