package com.software.optimize.solution.immutable;

import java.math.BigDecimal;

public class ImmutableObjectExample {

    public static void main(String[] args) {
        String str = "test";
        System.out.println("���� �� ���ڿ�: " + str);
        //���ڿ��� �빮�ڷ� �����ϴ� �޼ҵ带 �����ϸ�
        //�빮�ڷ� ����� ���ο� ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
        str = str.toUpperCase();
        System.out.println("���� �� ���ڿ�: " + str);
        
        BigDecimal big = new BigDecimal(10);
        System.out.println("���� �� BigDecimal ��: " + big);
        //���� BigDecimal�� 20�� ���ϴ� �޼ҵ带 �����ϸ�
        //���� ���� 10�� 20�� ���� ���ο� ��ü�� �����ؼ� ��ȯ�Ѵ�.
        big = big.add(new BigDecimal(20));
        System.out.println("���� �� BigDecimal ��: " + big);
        
    }
}
