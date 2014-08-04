package com.software.debug.problem.scenario;

import com.software.debug.solution.scenario.DocumentVO;

public class DocumentController {

    //문서를 생성하는 가상 메소드
    public boolean create(DocumentVO vo) {
        //전달된 문서가 null 이라면 문서를 생성할 수 없다
        boolean isOkay = true;
        if(vo == null) {
            isOkay = false;
        //docId의 접두사가 DOC가 아니면 문서가 아니다. 
        } else if(!vo.getDocId().startsWith("DOC")) {
            isOkay = false;
        //문서의 제목은 null일 수 없다.
        } else if(vo.getTitle() == null) {
            isOkay = false;
        //제목의 길이는 최대 20자다
        } else if(vo.getTitle().length() > 20) {
            isOkay = false;
        }
        
        if(isOkay) {
        /**
         * 문서 생성 절차
         */
        }
        
        return isOkay;
    }
    
    //문서를 삭제하는 가상 메소드
    public boolean delete(DocumentVO vo) {
        /**
         * 문서 삭제 절차
         */
        return true;
    }
    //문서를 수정하는 가장 메소드
    public boolean update(DocumentVO vo) {
        /**
         * 문서 수정 절차
         */
        return true;
    }
    
    //문서를 조회하는 가상 메소드
    public DocumentVO view(String docId) {
        if(docId == null) {
            return null;
        }
        /**
         * 문서 조회 절차
         */
        
        return new DocumentVO();
    }
    
}