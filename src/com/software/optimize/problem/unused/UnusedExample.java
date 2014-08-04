package com.software.optimize.problem.unused;

public class UnusedExample {
    //사용되지 않는 private 클래스 맴버 변수
    private String str = "test";
    
    //사용되지 않는 private 메소드
    private void unusedMethod() {
        /**
         * ... 
         */
    }
    
    public void sampleMethod() {
        //사용되지 않는 지역 변수
        String temp = "temp";
        System.out.println("temp는 사용되지 않았다.");
    }
    
    /**
     * @param usedValue: 사용된 전달 인자
     * @param unusedValue: 사용되지 않은 전달 인자
     */
    public void sampleMethod2(int usedValue, int unusedValue) {
        System.out.println("usedValue = " + usedValue);
    }
    
}
