package com.software.optimize.problem;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingExample {

    public static void main(String[] args) {
        //�ڹ� 1.5 ������ ���
        /**
         * ArrayList�� ������ ���� ���� �� �����Ƿ� ���ʿ��� ����ȯ�� �ؾ���
         */
        List list14 = new ArrayList();
        list14.add(new Integer(100));
        list14.add(new Integer(200));
        int result14 = (Integer) list14.get(0) + (Integer) list14.get(1);
        System.out.println(result14);
        
        //�ڹ� 1.5 �̻��� ���
        /**
         * ArrayList�� ������ ���� ���� �� �־ ���ʿ��� ����ȯ�� �ʿ� ����.
         */
        List<Integer> list15 = new ArrayList<Integer>();
        list15.add(100);
        list15.add(200);
        int result15 = list15.get(0) + list15.get(1);
        System.out.println(result15);
    }
    
    
}