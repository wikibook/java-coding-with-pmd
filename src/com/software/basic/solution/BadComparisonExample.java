package com.software.basic.solution;
public class BadComparisonExample {

    public static void main(String[] args) {
        // 어떠한 이유로 숫자가 아닌 값(NaN; Not a Number)을 할당
        Double errorValue = Double.NaN;
        
        // 오류를 검증하기 위해 오류 값을 Double.NaN으로 비교  
        if(Double.isNaN(errorValue)) {
            System.out.println("오류 발생");
        } else {
            System.out.println("정상 처리");
        }
    }
}
