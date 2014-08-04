package com.software.debug.solution;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTrueExample {

    @Test
    public void test() {
        
        //assertEquals�� ��ü�� ���� �������� Ȯ���ϴµ� �����ϴ� 
        //String a = null;
        String a = "test";
        String b = "test";
        assertEquals("a�� b�� ���� �����ؾ� �Ѵ�", a, b);
        
        //assertSame�� ��ü ��ü�� ���ϼ��� Ȯ���ϴ� ���� �޼ҵ��. 
        String c = "test";
        String d = c;
        assertSame("a�� b�� ������ ��ü���� �Ѵ�", c, d);

        //��ü�� null���� Ȯ���ϴ� ���� �޼ҵ�� assertNull�̴�.  
        String e = null;
        assertNull("e�� null �̿��� �Ѵ�", null);
        //���� �������� �����ϴ� ���� assertTrue�� �ƴ� assertFalse�� �����Ѵ�.
        assertFalse("b�� ����־�� �ȵȴ�", b.isEmpty());
        
    }
}