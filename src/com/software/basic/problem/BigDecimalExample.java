package com.software.basic.problem;

import java.math.BigDecimal;

public class BigDecimalExample {
    
    public static void main(String[] args) {
        
        /**
         * double�� �̿��ؼ� ����� ��� ��Ȯ�� ���� ����� �� ����.
         */
        double dValue1 = 4.7;
        double dValue2 = 0.4;
        
        System.out.println("double�� �̿��� �� ����� ��: " + dValue1 + " + " + dValue2 + " = " + (dValue1 + dValue2));
        
        
        /**
         * BigDecimal�� �̿��� ��� ��Ȯ�� �Ҽ��� ����� ���� ���� �� �ִ�.
         */
        //Bigdecmial�� ������ �Ʒ��� �ΰ��� �����  BigInteger�� ���� ZERO, ONE �׸��� TEN�� �̹� ���ǵǾ� �ִ�.
        BigDecimal bdValue1 = new BigDecimal("4.7");
        BigDecimal bdValue2 = BigDecimal.valueOf(0.4);
        
        //BigDecmial�� ����� �����ڰ� �ƴ� add:���ϱ�,subtract:����,multiply:���ϱ�, divide:������ ���� �޼ҵ带 �̿��Ѵ�. 
        System.out.println("BigDecimal�� �̿��� �� ����� ��: " + bdValue1 + " + " + bdValue2 + " = " + bdValue1.add(bdValue2));
    }
}
