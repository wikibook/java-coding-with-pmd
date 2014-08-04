package com.software.optimize.problem.inter;

public interface SampleInterface {
    /**
     * 인터페이스는 객체의 소통을 위한 규약이기 때문에
     * 기본적으로 인터페이스 내부의 모든 요소는 public으로 공개되어 있다.
     * 따라서 public 키워드를 따로 붙일 필요가 없으며, 
     * private과 protected를 사용할 수 없다,
     */
    int value = 0;
    String str = "test";
    
    void printValue();
    void printStr();
}
