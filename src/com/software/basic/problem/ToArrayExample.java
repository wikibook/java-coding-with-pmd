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
        
        //1. 느리고 불필요한 코드가 존재한다.
        for(int i=0; i < list.size(); i++) {
            array1[i] = list.get(i);
        }
    
        //2. new String[0]의 사이즈가 0이라 내부에서 불필요한 오브젝트를 생성해야 한다.
        String[] array2 = (String[])list.toArray(new String[0]);
        
        //3. java.lang.ClassCastException 에러가 발생한다.
        String[] array3 = (String[])list.toArray();
    }
}