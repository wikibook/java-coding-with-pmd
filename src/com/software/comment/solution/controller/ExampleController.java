package com.software.comment.solution.controller;

import com.software.comment.solution.vo.ExampleVO;

/**
 * @Class Name :ExampleController.java
 * @Description : 예제 Controller 인터페이스 XXXXX
 * @Modification Information
 * @
 * @  수정일      수정자            수정내용
 * @ 2013.09.09  배병선          최초 생성
 *
 *  @author 배병선
 *  @since 2013.09.09
 *  @version 1.0 
 */
public interface ExampleController {
	
	/**
	 * 조회 메소드
	 * @param vo
	 * @return 예제 VO를 반환
	 */
	ExampleVO view(ExampleVO vo);
	
	/**
	 * 등록 메소드
	 * @param vo
	 * @return 등록 결과 반환
	 */
	boolean insert(ExampleVO vo);
	
	/**
	 * 수정 메소드
	 * @param vo
	 * @return 수정 결과 반환
	 */
	boolean update(ExampleVO vo);
	
	/**
	 * 삭제 메소드
	 * @param vo
	 * @return 삭제 결과 반환
	 */
	boolean delete(ExampleVO vo);
}
