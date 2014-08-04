package com.software.debug.problem.scenario;

import com.software.debug.solution.scenario.DocumentVO;

public class DocumentController {

    //������ �����ϴ� ���� �޼ҵ�
    public boolean create(DocumentVO vo) {
        //���޵� ������ null �̶�� ������ ������ �� ����
        boolean isOkay = true;
        if(vo == null) {
            isOkay = false;
        //docId�� ���λ簡 DOC�� �ƴϸ� ������ �ƴϴ�. 
        } else if(!vo.getDocId().startsWith("DOC")) {
            isOkay = false;
        //������ ������ null�� �� ����.
        } else if(vo.getTitle() == null) {
            isOkay = false;
        //������ ���̴� �ִ� 20�ڴ�
        } else if(vo.getTitle().length() > 20) {
            isOkay = false;
        }
        
        if(isOkay) {
        /**
         * ���� ���� ����
         */
        }
        
        return isOkay;
    }
    
    //������ �����ϴ� ���� �޼ҵ�
    public boolean delete(DocumentVO vo) {
        /**
         * ���� ���� ����
         */
        return true;
    }
    //������ �����ϴ� ���� �޼ҵ�
    public boolean update(DocumentVO vo) {
        /**
         * ���� ���� ����
         */
        return true;
    }
    
    //������ ��ȸ�ϴ� ���� �޼ҵ�
    public DocumentVO view(String docId) {
        if(docId == null) {
            return null;
        }
        /**
         * ���� ��ȸ ����
         */
        
        return new DocumentVO();
    }
    
}