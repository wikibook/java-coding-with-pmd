package com.software.optimize.problem;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingExample {

    public static void main(String[] args) {
        //자바 1.5 이전의 방식
        /**
         * ArrayList의 데이터 형을 정할 수 없으므로 불필요한 형변환을 해야함
         */
        List list14 = new ArrayList();
        list14.add(new Integer(100));
        list14.add(new Integer(200));
        int result14 = (Integer) list14.get(0) + (Integer) list14.get(1);
        System.out.println(result14);
        
        //자바 1.5 이상의 방식
        /**
         * ArrayList의 데이터 형을 정할 수 있어서 불필요한 형변환이 필요 없다.
         */
        List<Integer> list15 = new ArrayList<Integer>();
        list15.add(100);
        list15.add(200);
        int result15 = list15.get(0) + list15.get(1);
        System.out.println(result15);
    }
    
    
}