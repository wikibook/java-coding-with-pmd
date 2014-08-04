package com.software.basic.solution.equals;

import java.util.HashMap;
import java.util.Map;

public class TestKlass {

    public static void main(String[] args) {
        SampleKlass sampleKlass = new SampleKlass(1, "test");
        
        SampleKlass sampleKlass2 = new SampleKlass(1, "test2");
        
        SampleKlass sampleKlass3 = new SampleKlass(1, "test");
        
        /**
         * SampleKlass�� equals �޼ҵ带 �̿��ؼ� ���Ѵ�.
         */
        System.out.println(sampleKlass.equals(sampleKlass2));
        
        System.out.println(sampleKlass.equals(sampleKlass3));
        
        
        Map<SampleKlass, String> map = new HashMap<SampleKlass, String>();
        
        map.put(new SampleKlass(1, "test"), "value1");
        
        //���� �츮�� ���ϴ� value1�� �ƴ϶� null�� ���´�.
        System.out.println(map.get(new SampleKlass(1, "test")));
        
    }
}
