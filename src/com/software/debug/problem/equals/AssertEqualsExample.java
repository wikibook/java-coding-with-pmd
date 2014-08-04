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
     * ���ڸ� �ڵ�� ��ȯȭ�� ����� ���������� �۵��ϴ��� �׽�Ʈ�ϴ� �޼ҵ�
     */
    @Test
    public void test() {
        
        //���������� ������ ���� ���� ���� ���ٸ� ����Ѵ�.
        assertEquals("CODE001", generator.toCode("�Ա�"));
        assertEquals("CODE002", generator.toCode("���"));
        assertEquals("CODE003", generator.toCode("��ȸ"));
        
        //������ ���� ���� ���� �ٸ��ٸ� ������ �߻��Ͽ� �ҽ��ڵ��� �������� ������ �� �ִ�.
        assertEquals("CODE003", generator.toCode("��ü"));
    }

}