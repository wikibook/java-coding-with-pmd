package com.software.optimize.problem.immutable;

import java.math.BigDecimal;

public class ImmutableObjectExample {

    public static void main(String[] args) {
        String str = "test";
        System.out.println("���� �� ���ڿ�: " + str);
        //���ڿ��� �빮�ڷ� �����ϴ� �޼ҵ� ����
        str.toUpperCase();
        System.out.println("���� �� ���ڿ�: " + str);
        
        BigDecimal big = new BigDecimal(10);
        System.out.println("���� �� BigDecimal ��: " + big);
        //�Һ� ��ü�� BigDecimal�� ���� ���ص� �ʱ⿡ ������ ���� ���� ������ �ʴ´�. 
        big.add(new BigDecimal(20));
        System.out.println("���� �� BigDecimal ��: " + big);
        
    }
}
