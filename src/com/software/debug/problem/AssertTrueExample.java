package com.software.debug.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTrueExample {

    @Test
    public void test() {
        //가장 의미 없는 테스트 형식
        assertTrue(true);
        
        //객체를 assertTrue는 객체의 값이 동일한지 확인하는데 부적절하다.
        //만약 a가 null이라면 NullPointerExcepion이 발생하기 가장 쉬운 방식이다.
        //String a = null;
        String a = "test";
        String b = "test";
        assertTrue("a와 b의 값은 동일해야 한다", a.equals(b));
        
        //객체 자체의 동일성을 확인 단정 메소드가 따로 존재한다. 
        String c = "test";
        String d = c;
        assertTrue("a와 b는 동일한 객체여야 한다", c == d);

        //객체가 null인지 확인하는 단정 메소드도 따로 존재하며 
        //assertTrue는 버그를 발생시킬 가능성이 있다.
        String e = null;
        assertTrue ("e는 null 이여야 한다", e == null);
        //값이 거짓임을 검토하는 것은 assertTrue가 아닌 assertFalse가 존재한다.
        assertTrue("b는 비어있어서는 안된다", !b.isEmpty());
        
    }
}