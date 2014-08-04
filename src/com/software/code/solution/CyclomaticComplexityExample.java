package com.software.code.solution;

import java.util.Arrays;

public class CyclomaticComplexityExample {

    public static void main(String[] args) {
        int[] array = {0,3,5,2,6,7,8,9,1,4};
        int[] sortedArray = new int[array.length];
        //단 한 줄로 배열을 정렬할 수 있다.
        Arrays.sort(array);
        //메소드 하나로 배열을 복사할 수 있다.
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        System.out.println("최종 결과"); 
        for(int v : sortedArray) {
            System.out.print(v + " "); 
        }
    }
}