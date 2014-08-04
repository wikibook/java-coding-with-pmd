package com.software.debug.junit3;

import junit.framework.TestCase;

public class JUnit3Example extends TestCase {

    private static  IDGenerator generator;
    
    protected static void setUpBeforeClass() throws Exception {
    }

    protected static void tearDownAfterClass() throws Exception {
    }

    /**
     * 테스트 메소드가 실행되기 전 IDGenerator 객체를 초기화한다.
     * 하지만 setUp이 아닌 setup으로 잘못 등록하였다.
     */
    protected void setup() throws Exception {
        generator = new IDGenerator(0);
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * JUnit3의 모든 테스트 메소드는 test라는 접두사를 포함해야 한다.
     * 모든 테스트 메소드가 실행되기 전 setUp 메소드가 IDGenerator 객체를 초기화하여
     * 모두 같은 결과가 도출된다.
     */
    public void testGenerator() {
        System.out.println(generator.getNewId());
    }
    
    public void testGenerator2() {
        System.out.println(generator.getNewId());
    }
    
    /**
     * test가 접두사가 아닌 접미사로 사용되어 테스트 메소드로 사용되지 못함
     */
    public void generator3Test() {
        System.out.println(generator.getNewId());
    }
}