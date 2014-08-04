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
        documentVO.setTitle("����");
        documentVO.setBody("����");
        documentVO.setAuthor("���̹�");
    }
    
    //�� ���� ���� �׽�Ʈ
    @Test
    public void testEmptyDoc() {
    	assertFalse("���� ���� ����: ������ null�� �� ����.",  controller.create(null) );
    }
    
    //docId �׽�Ʈ
    @Test
    public void testDocId(){
        documentVO.setDocId("IMG001");
        assertFalse("���� ���� ����: docId�� ���λ�� DOC���� �Ѵ�.",  controller.create(documentVO) );
    }
    
    //�� ���� ���� �׽�Ʈ
    @Test
    public void testEmptryTitle() {
        documentVO.setTitle(null);
        assertFalse("���� ���� ����: ������ ������ null�� �ƴϿ��� �Ѵ�.",  controller.create(documentVO) );
    }
    
    //���� ���� ���� �׽�Ʈ
    @Test
    public void testTitleLength() {
    	documentVO.setTitle("012345678901234567891");
        assertFalse("���� ���� ����: ������ ���̴� �ִ� 20�ڴ�",  controller.create(documentVO) );
    }
    
    //���� ���� ���� �׽�Ʈ
    @Test
    public void test() {
        
        assertTrue("���� ���� ����: ���� ���� �� ���� �߻�",  controller.create(documentVO) );
    }

}