package com.software.debug.junit3;

import junit.framework.TestCase;

public class JUnit3Example extends TestCase {

    private static  IDGenerator generator;
    
    protected static void setUpBeforeClass() throws Exception {
    }

    protected static void tearDownAfterClass() throws Exception {
    }

    /**
     * �׽�Ʈ �޼ҵ尡 ����Ǳ� �� IDGenerator ��ü�� �ʱ�ȭ�Ѵ�.
     * ������ setUp�� �ƴ� setup���� �߸� ����Ͽ���.
     */
    protected void setup() throws Exception {
        generator = new IDGenerator(0);
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * JUnit3�� ��� �׽�Ʈ �޼ҵ�� test��� ���λ縦 �����ؾ� �Ѵ�.
     * ��� �׽�Ʈ �޼ҵ尡 ����Ǳ� �� setUp �޼ҵ尡 IDGenerator ��ü�� �ʱ�ȭ�Ͽ�
     * ��� ���� ����� ����ȴ�.
     */
    public void testGenerator() {
        System.out.println(generator.getNewId());
    }
    
    public void testGenerator2() {
        System.out.println(generator.getNewId());
    }
    
    /**
     * test�� ���λ簡 �ƴ� ���̻�� ���Ǿ� �׽�Ʈ �޼ҵ�� ������ ����
     */
    public void generator3Test() {
        System.out.println(generator.getNewId());
    }
}