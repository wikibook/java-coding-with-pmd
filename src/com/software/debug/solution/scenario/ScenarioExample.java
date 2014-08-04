package com.software.debug.solution.scenario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ScenarioExample {

    private DocumentVO documentVO;
    private static DocumentController controller; 
    
    @BeforeClass
    public static void beforeClass() {
        controller = new DocumentController();
    }
    
    @Before
    public void before() {
        documentVO = new DocumentVO();
        documentVO.setDocId("DOC001");
        documentVO.setTitle("제목");
        documentVO.setBody("내용");
        documentVO.setAuthor("김이박");
    }
    
    //빈 문서 생성 테스트
    @Test
    public void testEmptyDoc() {
    	assertFalse("문서 생성 실패: 문서는 null일 수 없다.",  controller.create(null) );
    }
    
    //docId 테스트
    @Test
    public void testDocId(){
        documentVO.setDocId("IMG001");
        assertFalse("문서 생성 실패: docId의 접두사는 DOC여야 한다.",  controller.create(documentVO) );
    }
    
    //빈 문서 제목 테스트
    @Test
    public void testEmptryTitle() {
        documentVO.setTitle(null);
        assertFalse("문서 생성 실패: 문서의 제목은 null이 아니여야 한다.",  controller.create(documentVO) );
    }
    
    //문서 제목 길이 테스트
    @Test
    public void testTitleLength() {
    	documentVO.setTitle("012345678901234567891");
        assertFalse("문서 생성 실패: 제목의 길이는 최대 20자다",  controller.create(documentVO) );
    }
    
    //정상 문서 생성 테스트
    @Test
    public void test() {
        
        assertTrue("문서 생성 실패: 문서 생성 중 오류 발생",  controller.create(documentVO) );
    }

}