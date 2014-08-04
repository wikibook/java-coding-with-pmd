package com.software.debug.solution.equals;

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
        assertEquals("�Ա� ��û �޽����� �ڵ� ��ȯ", "CODE001", generator.toCode("�Ա�"));
        assertEquals("��� ��û �޽����� �ڵ� ��ȯ", "CODE002", generator.toCode("���") );
        assertEquals("��ȸ ��û �޽����� �ڵ� ��ȯ", "CODE003", generator.toCode("��ȸ"));
        
        //������ ���� ���� ���� �ٸ��ٸ� ������ �߻��Ͽ� �ҽ��ڵ��� �������� ������ �� �ִ�.
        assertEquals("��ü ��û �޽����� �ڵ� ��ȯ", "CODE003", generator.toCode("��ü"));
    }

}