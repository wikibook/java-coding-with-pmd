package com.software.basic.solution;

import java.util.ArrayList;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        
        //아래와 같이 목표가 되는 배열의 자료형과 배열의 정확한 길이를 전달한다.
        String[] array3 = (String[])list.toArray(new String[list.size()]);
        for(String value : array3) {
            System.out.println(value);
        }
        
    }
}