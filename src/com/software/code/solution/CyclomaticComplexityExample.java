package com.software.code.solution;

import java.util.Arrays;

public class CyclomaticComplexityExample {

    public static void main(String[] args) {
        int[] array = {0,3,5,2,6,7,8,9,1,4};
        int[] sortedArray = new int[array.length];
        //�� �� �ٷ� �迭�� ������ �� �ִ�.
        Arrays.sort(array);
        //�޼ҵ� �ϳ��� �迭�� ������ �� �ִ�.
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        System.out.println("���� ���"); 
        for(int v : sortedArray) {
            System.out.print(v + " "); 
        }
    }
}