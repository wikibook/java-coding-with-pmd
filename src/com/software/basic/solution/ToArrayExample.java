package com.software.basic.solution;

import java.util.ArrayList;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        
        //�Ʒ��� ���� ��ǥ�� �Ǵ� �迭�� �ڷ����� �迭�� ��Ȯ�� ���̸� �����Ѵ�.
        String[] array3 = (String[])list.toArray(new String[list.size()]);
        for(String value : array3) {
            System.out.println(value);
        }
        
    }
}