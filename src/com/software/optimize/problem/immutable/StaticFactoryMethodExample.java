package com.software.optimize.problem.immutable;

import java.math.BigInteger;

public class StaticFactoryMethodExample {

    public static void main(String[] args) {
        /*
         * Boolean ��ü�� ���´� true�� false�� �����ϹǷ�
         * �� ��ü�� false�� ture ���� ���� �ű� ��ü�� �������� �ʰ� 
         * �̸� ��ϵǾ� �ִ� ��ü�� �����Ѵ�.  
         */
        //Boolean bool1 = new Boolean(false); ���ο� ��ü�� ������ �ʿ䰡 ����.
        Boolean bool1 = Boolean.FALSE;
        //Boolean bool2 = new Boolean(true); ���ο� ��ü�� ������ �ʿ䰡 ����.
        Boolean bool2 = Boolean.TRUE;
        
        /*
         * BigInteger���� ���� ���Ǵ� 0,1 �׸��� 10 ���� 
         *  static factory method ������ Ȱ���Ͽ�
         *  �̸� ��ϵǾ� �ű� ��ü�� ������ �ʿ䰡 ����.
         */
        BigInteger intZero = BigInteger.ZERO;
        BigInteger intOne = BigInteger.ONE;
    }
}