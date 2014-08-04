package com.software.debug.solution;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTrueExample {

    @Test
    public void test() {
        
        //assertEquals은 객체의 값이 동일한지 확인하는데 적절하다 
        //String a = null;
        String a = "test";
        String b = "test";
        assertEquals("a와 b의 값은 동일해야 한다", a, b);
        
        //assertSame은 객체 자체의 동일성을 확인하는 단정 메소드다. 
        String c = "test";
        String d = c;
        assertSame("a와 b는 동일한 객체여야 한다", c, d);

        //객체가 null인지 확인하는 단정 메소드는 assertNull이다.  
        String e = null;
        assertNull("e는 null 이여야 한다", null);
        //값이 거짓임을 검토하는 것은 assertTrue가 아닌 assertFalse가 존재한다.
        assertFalse("b는 비어있어서는 안된다", b.isEmpty());
        
    }
}