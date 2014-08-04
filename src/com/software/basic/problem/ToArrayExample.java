package com.software.basic.problem;

import java.util.ArrayList;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        
        String[] array1 = new String[list.size()];
        
        //1. ������ ���ʿ��� �ڵ尡 �����Ѵ�.
        for(int i=0; i < list.size(); i++) {
            array1[i] = list.get(i);
        }
    
        //2. new String[0]�� ����� 0�̶� ���ο��� ���ʿ��� ������Ʈ�� �����ؾ� �Ѵ�.
        String[] array2 = (String[])list.toArray(new String[0]);
        
        //3. java.lang.ClassCastException ������ �߻��Ѵ�.
        String[] array3 = (String[])list.toArray();
    }
}