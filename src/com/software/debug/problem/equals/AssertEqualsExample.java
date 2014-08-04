package com.software.debug.problem.equals;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AssertEqualsExample {
    
    private static CodeGenerator generator;
    
    @BeforeClass
    public  static void setUpBeforeClass() {
        generator = new CodeGenerator();
    }
    
    /**
     * 문자를 코드로 변환화는 기능이 정상적으로 작동하는지 테스트하는 메소드
     */
    @Test
    public void test() {
        
        //정상적으로 예상한 값과 실제 값이 같다면 통과한다.
        assertEquals("CODE001", generator.toCode("입금"));
        assertEquals("CODE002", generator.toCode("출금"));
        assertEquals("CODE003", generator.toCode("조회"));
        
        //예상한 값과 실제 값이 다르다면 오류가 발생하여 소스코드의 문제점을 진단할 수 있다.
        assertEquals("CODE003", generator.toCode("이체"));
    }

}