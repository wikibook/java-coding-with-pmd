package com.software.basic.problem;

public class OctalValueExample2 {
    public static void main(String[] args) {
        /**
         * 아래의 두 변수는 분명 다른 값이지만 
         * 같은 값으로 혼동될 수 있다. 
         */
        int decValue = 10;
        int octValue = 010;    //octValue는 10아니라 8이다.
        
        System.out.println(String.format("10진수로 변환한 값: decValue = %d | octValue = %d", decValue, octValue));
        
        /**
         * 아래의 두 변수 또한 10진수로 오인될 가능성이 높다. 
         */
        int octNum1 = 012;
        int octNum2 = 010;
        
        System.out.println(String.format("결과는 120이 아닌 %d 이다", octNum1 * octNum2));
        
    }
}