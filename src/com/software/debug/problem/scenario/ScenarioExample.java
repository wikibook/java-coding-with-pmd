package com.software.debug.problem.scenario;

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
    
    
    @Test
    public void test() {
        
        //�� ���� ���� �׽�Ʈ
        assertFalse("���� ���� ����: ������ null�� �� ����.",  controller.create(null) );
        
        //docId �׽�Ʈ
        documentVO.setDocId("IMG001");
        assertFalse("���� ���� ����: docId�� ���λ�� DOC���� �Ѵ�.",  controller.create(documentVO) );
        
        //���� ���� �׽�Ʈ
        documentVO.setDocId("DOC001");
        documentVO.setTitle(null);
        assertFalse("���� ���� ����: ������ ������ null�� �ƴϿ��� �Ѵ�.",  controller.create(documentVO) );
        
        //���� ���� ���� �׽�Ʈ
        documentVO.setTitle("012345678901234567891");
        assertFalse("���� ���� ����: ������ ���̴� �ִ� 20�ڴ�",  controller.create(documentVO) );
        
        //���� ���� ���� �׽�Ʈ
        assertTrue("���� ���� ����: ���� ���� �� ���� �߻�",  controller.create(documentVO) );
    }

}