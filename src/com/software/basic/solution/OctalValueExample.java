package com.software.basic.solution;

public class OctalValueExample {
    public static void main(String[] args) {
        /**
         * 모든 수치는 10진수로 통일하여 사용한다.
         */
        int decValue1 = 10;
        int decValue2 = 8;
        int decResult = decValue1 + decValue2;
        
        //다만 결과를 표출할 때만 필요한 진수로 변환하여 출력한다.
        System.out.println(String.format("16진수 값: %x\t|\t10진수 값:  %d\t|\t8진수 값: %o", decResult,decResult,decResult) );
        
    }
}