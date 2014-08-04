package com.software.debug;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {

    /**
     * 테스트 클래스가 초기화 시에 한번만 실행
     * @throws Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * 테스트 클래스 종료 시에 한번만 실행
     * @throws Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * 각 테스트 메소드 실행 전에 실행
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * 각 테스트 메소드 실행 후에 실행
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
