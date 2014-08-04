package com.software.debug.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTrueExample {

    @Test
    public void test() {
        //���� �ǹ� ���� �׽�Ʈ ����
        assertTrue(true);
        
        //��ü�� assertTrue�� ��ü�� ���� �������� Ȯ���ϴµ� �������ϴ�.
        //���� a�� null�̶�� NullPointerExcepion�� �߻��ϱ� ���� ���� ����̴�.
        //String a = null;
        String a = "test";
        String b = "test";
        assertTrue("a�� b�� ���� �����ؾ� �Ѵ�", a.equals(b));
        
        //��ü ��ü�� ���ϼ��� Ȯ�� ���� �޼ҵ尡 ���� �����Ѵ�. 
        String c = "test";
        String d = c;
        assertTrue("a�� b�� ������ ��ü���� �Ѵ�", c == d);

        //��ü�� null���� Ȯ���ϴ� ���� �޼ҵ嵵 ���� �����ϸ� 
        //assertTrue�� ���׸� �߻���ų ���ɼ��� �ִ�.
        String e = null;
        assertTrue ("e�� null �̿��� �Ѵ�", e == null);
        //���� �������� �����ϴ� ���� assertTrue�� �ƴ� assertFalse�� �����Ѵ�.
        assertTrue("b�� ����־�� �ȵȴ�", !b.isEmpty());
        
    }
}